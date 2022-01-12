public java.lang.StringBuilder qMarks(int length) {
    java.lang.StringBuilder q = new java.lang.StringBuilder();
    for (int i = 0; i < length; i++) {
        if (i == (length - 1))
            q.append("? )");
        else
            q.append(" ?, ");
        
    }
    return q;
}