public boolean contains(java.lang.String word) {
    for (java.lang.Integer integer : seeds) {
        boolean result = buckets[java.lang.Math.abs(((org.apache.mahout.math.MurmurHash3.murmurhash3x8632(word.toLowerCase().getBytes(), 0, word.length(), integer)) % (buckets.length)))];
        if (!result) {
            return false;
        }
    }
    return true;
}