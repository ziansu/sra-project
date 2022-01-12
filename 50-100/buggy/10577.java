@java.lang.Override
public org.pb.x12.EDI parse(java.io.InputStream source) throws java.io.IOException, org.pb.x12.FormatException {
    java.lang.StringBuilder strBuffer = new java.lang.StringBuilder();
    char[] cbuf = new char[1024];
    int length = -1;
    java.io.Reader reader = new java.io.BufferedReader(new java.io.InputStreamReader(source));
    while ((length = reader.read(cbuf)) != (-1)) {
        strBuffer.append(cbuf, 0, length);
    } 
    java.lang.String strSource = strBuffer.toString();
    return parse(strSource);
}