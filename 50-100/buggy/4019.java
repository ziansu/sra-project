public boolean contains(java.lang.String key) {
    if (key == null) {
        throw new java.lang.NullPointerException("ST.contains(): key is null");
    }else {
        for (int i = 0; i < (n); i++)
            if (key.equals(keys[i])) {
                edu.princeton.cs.algs4.StdOut.println(keys[i]);
                edu.princeton.cs.algs4.StdOut.println("Achouuuuuu");
                return true;
            }
        
    }
    return false;
}