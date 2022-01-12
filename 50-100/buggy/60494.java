private int readInt(java.lang.String prompt) {
    int value = 0;
    boolean intRead = false;
    do {
        java.lang.System.out.print(prompt);
        java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
        java.lang.String line = in.nextLine();
        java.util.Scanner scannerLine = new java.util.Scanner(line);
        if (scannerLine.hasNextInt()) {
            intRead = true;
            value = scannerLine.nextInt();
            in.close();
            scannerLine.close();
        }
    } while (!intRead );
    return value;
}