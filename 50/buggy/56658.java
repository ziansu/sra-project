public void flush() throws java.io.IOException {
    final java.io.ByteArrayOutputStream baos = byteArrayOutputStream;
    steps.add(new org.jboss.marshalling.cloner.SerializingCloner.ByteDataStep(baos.toByteArray()));
    baos.reset();
}