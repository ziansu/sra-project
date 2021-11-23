public boolean containsKey(int k) {
    return ((k >= 0) && ((vals.length) > k)) && ((vals[k]) != null);
}