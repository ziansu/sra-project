private java.lang.String readStringFromFile(java.io.FileInputStream fis, int length) throws java.io.IOException {
    byte[] stringBuffer = new byte[length];
    int read = fis.read(stringBuffer);
    if (read < length) {
        throw new com.rhodes.chris.taskpopper.exceptions.TaskScreenException("didn't read full string from save file");
    }
    return new java.lang.String(stringBuffer);
}