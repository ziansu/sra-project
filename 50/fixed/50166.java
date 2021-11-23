public void writeBinaryByte(byte data) {
    try {
        outputStream.write(data);
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
    }
}