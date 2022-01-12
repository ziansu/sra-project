private int readChar(java.util.Scanner in) {
    java.lang.StringBuffer sbf = new java.lang.StringBuffer();
    for (int i = 0; i < (H); i++) {
        sbf.append(in.next());
    }
    return dico.get(sbf.toString());
}