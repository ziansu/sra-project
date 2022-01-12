private void processMessage(byte[] message) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(message);
    java.io.ObjectInput in = new java.io.ObjectInputStream(bis);
    java.lang.String s = ((java.lang.String) (in.readObject()));
    log.info("==================", s);
}