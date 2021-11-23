public void receiveCorruptedFileNameToChecksum(java.lang.String checksum) {
    java.lang.System.err.println("Packetfehler!!");
    java.io.File toDelete = new java.io.File((((getUncheckedPartfilesPath()) + checksum) + ".TEMP"));
}