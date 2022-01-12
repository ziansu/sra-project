public static void main(java.lang.String[] args) {
    final int n = 10000;
    int[] arr = new int[n];
    cc.cynic.jvmtests.ThreadedMaxFinder.initarray(arr, n);
    java.lang.System.out.println(("Sequential max gives: " + (cc.cynic.jvmtests.MaxFinder.seqmax(arr))));
    java.lang.System.out.println(("Threaded max gives: " + (cc.cynic.jvmtests.MaxFinder.max(arr))));
}