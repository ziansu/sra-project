public void writeBinaryString(java.lang.String theString) {
    try {
        boolean loop = true;
        char[] stringArray = theString.toCharArray();
        for (char aStringArray : stringArray) {
            outputStream.write(((int) (aStringArray)));
        }
        outputStream.write(0);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}