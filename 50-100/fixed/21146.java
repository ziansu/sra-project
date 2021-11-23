private boolean isUnbalanced(java.lang.String image, java.lang.String pattern) {
    int occurance = 0;
    int index = image.indexOf("=");
    index = image.indexOf(pattern, (index + 1));
    while (index >= 0) {
        occurance++;
        index = image.indexOf(pattern, (index + 1));
    } 
    if ((occurance % 2) != 0) {
        return true;
    }
    return false;
}