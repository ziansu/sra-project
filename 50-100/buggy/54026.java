@java.lang.Override
public java.lang.Character readDataFromArrayOfBytes(byte[] b, int index) {
    int value = 0;
    int lSB;
    for (int i = 0; i < (dataManagementClasses.CharDataReader.CHARSIZE); i++) {
        value = value << 8;
        lSB = 255 & (b[(index + i)]);
        value = value | lSB;
    }
    return java.lang.String.valueOf(value).charAt(0);
}