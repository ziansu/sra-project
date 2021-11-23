public static packet createEOT(int SeqNum) throws java.lang.Exception {
    return new packet(2, SeqNum, new java.lang.String());
}