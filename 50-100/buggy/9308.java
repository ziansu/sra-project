public void addWord(java.lang.String word) {
    for (java.lang.Integer integer : seeds) {
        buckets[java.lang.Math.abs(((org.apache.mahout.math.MurmurHash3.murmurhash3x8632(word.getBytes(), 0, 0, integer)) % (buckets.length)))] = true;
    }
}