private java.lang.Integer compareBits(java.lang.String a, java.lang.String b) {
    int count = 0;
    for (int i = 0; i < (java.lang.Math.min(a.length(), b.length())); i++) {
        if (!((a.indexOf(i)) == (b.indexOf(i))))
            return count;
        
        count++;
    }
    return count;
}