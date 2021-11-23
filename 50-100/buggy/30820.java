protected void sendReadCommand(byte[] readCmd) throws java.io.IOException {
    dataOut.write(readCmd);
    dataOut.flush();
    int firstByte = dataIn.read();
    if (firstByte == ((Bno055Constants.ERR_BYTE) & 255)) {
        dataIn.readByte();
        return ;
    }
    if (firstByte != ((Bno055Constants.ACK_BYTE) & 255))
        throw new java.io.IOException(java.lang.String.format("Register Read Error: %02X", firstByte));
    
}