public int getIndexFromValue(java.lang.String[] list, java.lang.String v) {
    for (int i = 0; i != (list.length); i++) {
        if (list[i].equals(v))
            return i;
        
    }
    return 0;
}