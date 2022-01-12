public static byte[] convertToPrimative(java.lang.Byte[] toConvert) {
    byte[] primative = new byte[toConvert.length];
    for (int i = 0; i < (toConvert.length); i++)
        primative[i] = toConvert[i];
    
    return primative;
}