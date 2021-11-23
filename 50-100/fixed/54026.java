@java.lang.Override
public java.lang.Character readDataFromArrayOfBytes(byte[] b, int index) {
    char value = 0;
    int lSB;
    for (int i = 0; i < (dataManagementClasses.CharDataReader.CHARSIZE); i++) {
        value = ((char) (value << 8));
        lSB = 255 & (b[(index + i)]);
        value = ((char) (value | lSB));
    }
    return value;
}