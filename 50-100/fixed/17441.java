private void setBufferAnswer(java.lang.Object answer) throws java.io.IOException {
    try {
        java.nio.ByteBuffer resultBb = constructResponse("Answer", answer);
        addSendHeader(sc, resultBb.position());
        resultBb.flip();
        bb.put(resultBb);
    } catch (java.nio.BufferOverflowException e) {
        bb.clear();
        setBufferError("Too Long");
    }
}