static java.util.List<java.lang.Integer> genRandList(int sz) {
    java.util.List<java.lang.Integer> lst = new java.util.ArrayList<>(sz);
    for (int i = 0; i < sz; i++)
        lst.add(((int) ((java.lang.Math.random()) * (HashTableLinearProbingTest.MAX_RAND_NUM))));
    
    java.util.Collections.shuffle(lst);
    return lst;
}