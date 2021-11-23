public static void main(java.lang.String[] args) {
    int sum = 0;
    int num = java.lang.Integer.parseInt(args[0]);
    int[] array = new int[num];
    for (int i = 1; i <= num; i++) {
        array[(i - 1)] = i;
        sum += i;
    }
    java.lang.System.out.println(sum);
}