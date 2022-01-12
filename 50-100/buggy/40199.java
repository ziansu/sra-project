public boolean exists(int[] A, int[] B, int k) {
    java.util.Set<java.lang.Integer> set = new java.util.HashSet<>();
    for (int aA : A)
        set.add(aA);
    
    for (int aB : B) {
        if (set.contains(aB))
            return true;
        
    }
    return false;
}