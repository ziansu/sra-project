private int getColumn() {
    int x;
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    while (true) {
        java.lang.System.out.print("Please enter the column number (1-10):");
        x = scanner.nextInt();
        if ((x >= 1) & (x <= 10))
            return x - 1;
        
    } 
}