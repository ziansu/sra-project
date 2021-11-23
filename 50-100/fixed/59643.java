public java.lang.Object[] getSubset(int total, int num) {
    java.util.Random rand = new java.util.Random();
    java.util.List<java.lang.Integer> ret = new java.util.ArrayList<java.lang.Integer>();
    int i = 0;
    int j;
    while (i < num) {
        j = rand.nextInt(total);
        if (!(ret.contains(j))) {
            ret.add(j);
            i++;
        }
    } 
    return ret.toArray();
}