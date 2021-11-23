private int readChar(java.util.Scanner in) {
    java.lang.StringBuffer sbf = new java.lang.StringBuffer();
    for (int i = 0; i < (H); i++) {
        sbf.append(in.next());
    }
    java.lang.System.err.println(("sbf " + (sbf.toString())));
    return dico.get(sbf.toString());
}