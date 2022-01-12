public void send(java.io.DataOutputStream os) {
    byte[] stringBytes = playerid.getBytes();
    try {
        os.writeLong(timestamp);
        os.write(stringBytes.length);
        os.write(stringBytes, 0, stringBytes.length);
        os.writeInt(command);
        os.writeInt(xcord);
        os.write(ycord);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}