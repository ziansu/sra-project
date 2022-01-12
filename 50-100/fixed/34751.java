public boolean removeRelatedClass(java.lang.String[] relatedClass) {
    for (java.lang.String[] c : relatedClasses) {
        if ((c[0].equals(relatedClass[0])) && (c[1].equals(relatedClass[1]))) {
            relatedClasses.remove(c);
            return true;
        }
    }
    return false;
}