public static int[] reverseByIndex(int[] xs) {
    int[] res = new int[xs.length];
    com.github.beenotung.javalib.Utils.par_foreach(xs.length, ( i) -> res[xs[i]] = i);
    return res;
}