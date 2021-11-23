public static packet createEOT(int SeqNum) throws java.lang.Exception {
    return new packet(2, SeqNum, 0, new java.lang.String());
}