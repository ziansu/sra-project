public static void main(java.lang.String[] args) {
    while (true) {
        Console.init();
        java.lang.System.out.println();
        java.lang.System.out.println("> Si vous souhaitez rejouer, taper (1)");
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        if ((Console.isNumber(sc.nextLine(), 1)) == 1) {
            sc.close();
            Grid.reset();
            Console.reset();
        }else {
            sc.close();
            break;
        }
    } 
}