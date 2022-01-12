private char requireHexademical() {
    char c = next();
    if (!(isHexadecimal(c)))
        throw makeException("hexadecimal digit", c);
    
    return c;
}