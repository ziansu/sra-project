public static void main(java.lang.String[] args) {
    int sum = 0;
    int[] array = new int[5];
    for (int i = 1; i <= 5; i++) {
        array[(i - 1)] = i;
        sum += i;
    }
    java.lang.System.out.println(sum);
}