private void require(char c) {
    requireNotDone();
    char n = next();
    if (n != c)
        throw makeException(c, n);
    
}