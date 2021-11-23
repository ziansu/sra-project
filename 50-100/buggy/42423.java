private int addSubAlphabetically(java.lang.String finalS) {
    int i = (subs.size()) - 1;
    while ((finalS.compareTo(subs.get(i))) < 0) {
        i--;
    } 
    i += 1;
    subs.add(i, finalS);
    return i;
}