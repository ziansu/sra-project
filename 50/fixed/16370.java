private boolean isSeparator(char read) {
    switch (read) {
        case ' ' :
        case '\t' :
            return true;
        default :
            return false;
    }
}