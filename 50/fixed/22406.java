public java.util.Date mostRecent() {
    if ((mementos.size()) <= 0)
        return new java.util.Date(0);
    
    java.util.Collections.sort(mementos, this);
    return mementos.get(0).getDate();
}