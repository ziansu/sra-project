public static int[] swap(int[] array, java.util.Random r) {
    int a = r.nextInt(array.length);
    int b = r.nextInt(((array.length) - 1));
    return meka.core.A.swap(array, a, (a == b ? (array.length) - 1 : b));
}