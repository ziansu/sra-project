public void setListStringCount(int count) {
    if (count < 0) {
        count = 0;
    }
    java.util.List<java.lang.String> l = getListString();
    int lCount = (l == null) ? 0 : l.size();
    while (lCount > count) {
        l.remove(l.remove(((l.size()) - 1)));
        lCount--;
    } 
    while (lCount < count) {
        l.add("");
        lCount++;
    } 
}