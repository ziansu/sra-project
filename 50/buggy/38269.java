public byte[] GetTTH_Value(java.lang.String Filename) throws java.io.IOException {
    GetTTH(Filename);
    return TTH[((LevelCount) - 1)][0];
}