public static void main(java.lang.String[] args) {
    java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Введіть кількість чисел(наприклад 1000):");
    int input = in.nextInt();
    for (int i = 1; i <= input; i++) {
        if (((i % 3) == 0) || ((i % 9) == 0))
            java.lang.System.out.print((i + " "));
        
    }
}