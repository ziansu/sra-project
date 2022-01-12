public static void main(java.lang.String[] args) {
    int[] array = new int[java.lang.Integer.parseInt(args[1])];
    for (int i = 0; i < (array.length); i++) {
        array[i] = i + 1;
    }
    Main.sieve(array);
    Main.goldbach(array);
}