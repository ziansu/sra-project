private boolean match(char expected) {
    if (isAtEnd())
        return false;
    
    if ((source.charAt(current)) != expected)
        return false;
    
    (current)++;
    return false;
}