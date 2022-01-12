public static java.lang.String readAll(java.io.Reader reader, int bufferSize) throws java.io.IOException {
    final java.lang.StringBuilder contents = new java.lang.StringBuilder();
    char[] buf = new char[bufferSize];
    while (true) {
        int amt = reader.read(buf);
        if (amt < 0)
            break;
        
        contents.append(buf, 0, amt);
        if (amt < (buf.length))
            break;
        
    } 
    return contents.toString();
}