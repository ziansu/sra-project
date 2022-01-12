public void initialize(int N, java.lang.String labels) {
    java.lang.String[] ls = labels.split(" ");
    for (java.lang.String l : ls) {
        label_A.put(l, new int[N + 1]);
        label_B.put(l, new double[N + 1]);
    }
    return ;
}