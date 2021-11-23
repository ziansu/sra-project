public java.lang.StringBuilder qMarks(int length, int start) {
    java.lang.StringBuilder q = new java.lang.StringBuilder();
    for (int i = start; i < length; i++) {
        if (i == (length - 1))
            q.append("? )");
        else
            q.append(" ?, ");
        
    }
    return q;
}