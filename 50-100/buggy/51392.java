public static java.lang.Integer[] reverseByIndex(java.lang.Integer[] xs) {
    java.lang.Integer[] res = new java.lang.Integer[xs.length];
    com.github.beenotung.javalib.Utils.par_foreach(xs.length, ( i) -> res[xs[i]] = i);
    return res;
}