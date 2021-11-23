public int insert(java.util.Random rg, java.lang.Integer[] ind, int noi) {
    int j = rg.nextInt(noi);
    for (java.lang.Integer i : ind) {
        if (i == j)
            return insert(rg, ind, noi);
        
    }
    return j;
}