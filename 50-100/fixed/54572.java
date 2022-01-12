public boolean hasClass(java.lang.String className) {
    int i = 0;
    while (i < (classRelated.size())) {
        if (classRelated.get(i).equals(className)) {
            return true;
        }
        i++;
    } 
    return false;
}