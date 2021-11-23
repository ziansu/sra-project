public java.lang.String nextLine() throws java.io.IOException {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    byte c;
    boolean read = false;
    while ((c = read()) != (-1)) {
        if (c == '\n') {
            read = true;
            break;
        }
        if (c >= ' ')
            sb.append(((char) (c)));
        
    } 
    if (!read) {
        return null;
    }
    return sb.toString();
}