public java.lang.String getID() {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    for (int i = 0; i < (ID.length); i++) {
        sb.append(ID[i]);
        if (i < ((ID.length) - 1))
            sb.append(" ");
        
    }
    return sb.toString();
}