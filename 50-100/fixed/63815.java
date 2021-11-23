public java.lang.String[] getNames(int category) {
    if ((category < 1) || (category > 5))
        return null;
    
    int offset = category - 1;
    java.lang.String[] names = new java.lang.String[5];
    for (int i = 0; i < 5; i++) {
        names[i] = scores[((offset * 5) + i)].getName();
    }
    return names;
}