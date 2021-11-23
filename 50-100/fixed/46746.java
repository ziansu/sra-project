public static java.lang.String readFixedString(int size, java.io.DataInput in) throws java.io.IOException {
    java.lang.StringBuilder b = new java.lang.StringBuilder(size);
    int i = 0;
    boolean more = true;
    while (more && (i < size)) {
        char ch = in.readChar();
        i++;
        if (ch == 0)
            more = false;
        else
            b.append(ch);
        
    } 
    in.skipBytes((2 * (size - i)));
    return b.toString();
}