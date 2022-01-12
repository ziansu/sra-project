public static <A> A[] castArray(java.lang.Object[] os) {
    A a = github.com.beenotung.javalib.Utils.firstNonNull(((A[]) (os))).get();
    return a == null ? ((A[]) (os)) : github.com.beenotung.javalib.Utils.castArray(os, ((java.lang.Class<A>) (a.getClass())));
}