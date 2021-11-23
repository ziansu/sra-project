private char requireHexademical() {
    char c = next();
    if (!(isHexadecimal(c)))
        makeException("hexadecimal digit", c);
    
}