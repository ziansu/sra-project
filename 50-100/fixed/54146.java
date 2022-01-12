public static void main(java.lang.String[] args) {
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    int input = scan.nextInt();
    int count = 0;
    while (input != 0) {
        count = count + (input & 1);
        input = input >>> 1;
    } 
    java.lang.System.out.println(count);
    scan.close();
}