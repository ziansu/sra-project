static java.lang.Integer[] genUniqueRandList(int sz) {
    java.util.List<java.lang.Integer> lst = new java.util.ArrayList<>(sz);
    for (int i = 0; i < sz; i++)
        lst.add(i);
    
    java.util.Collections.shuffle(lst);
    java.lang.Integer[] retAr = new java.lang.Integer[sz];
    lst.toArray(retAr);
    return retAr;
}