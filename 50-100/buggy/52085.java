void relevant(java.lang.String[] requisites) {
    if (requisites == null) {
        return ;
    }
    for (int i = 0; i < (requisites.length); i++) {
        java.lang.Class c = findClass(requisites[i]);
        c.RelUp();
        setRelevance(c);
    }
}