private void require(java.lang.String s) {
    if ((peek().toString()) != s)
        throw makeException(s);
    
    next();
}