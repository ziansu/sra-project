public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (sortParameters.size()); i++) {
        sb.append(sortParameters.get(i).toString());
        if (i < (sortParameters.size()))
            sb.append(";");
        
    }
    return sb.toString();
}