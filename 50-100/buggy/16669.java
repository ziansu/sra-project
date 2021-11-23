public int get(java.lang.String key) {
    if (key == null) {
        throw new java.lang.NullPointerException("ST.get(): key is null");
    }else {
        for (int i = 0; i < (n); i++) {
            if (key.equals(keys[i])) {
                edu.princeton.cs.algs4.StdOut.println("Achou aqui dentro");
                return values[i];
            }
        }
        edu.princeton.cs.algs4.StdOut.println("Se fodeeeer");
        return -1;
    }
}