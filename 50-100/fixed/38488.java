public java.lang.String apply(java.lang.CharSequence inputString) {
    java.lang.StringBuilder output = new java.lang.StringBuilder();
    int i = -1;
    int len = (length) - (inputString.length());
    while ((++i) < len) {
        output.append(fill);
    } 
    output.append(inputString);
    return output.toString();
}