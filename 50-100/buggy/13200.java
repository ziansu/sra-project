public java.lang.String toString(java.lang.String sp) {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    for (int i = 0; i < (items.size()); i++) {
        if (i == 0)
            sb.append(items.get(i));
        else {
            sb.append(sp);
            sb.append(items.get(i));
        }
    }
    return sb.toString();
}