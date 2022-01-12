private java.lang.String listToString(java.util.List<java.lang.String> list) {
    java.lang.StringBuffer strBuf = new java.lang.StringBuffer();
    for (int i = 0; i < (list.size()); i++) {
        strBuf.append(list.get(i));
        if (i < ((list.size()) - 1))
            strBuf.append(' ');
        
    }
    return strBuf.toString();
}