public boolean isElementIgnored(int i) {
    if (i >= (ignoreElement.length))
        return true;
    
    return ignoreElement[i];
}