public void flush() throws java.io.IOException {
    super.flush();
    final java.io.ByteArrayOutputStream baos = byteArrayOutputStream;
    steps.add(new org.jboss.marshalling.cloner.SerializingCloner.ByteDataStep(baos.toByteArray()));
    baos.reset();
}