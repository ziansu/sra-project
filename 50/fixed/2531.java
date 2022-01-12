private int hash(java.lang.String key, int mod) {
    return (java.lang.Math.abs(key.hashCode())) % mod;
}