private static long scan_isbn(java.lang.String prompt) {
    boolean got = false;
    long isbn = 0;
    while (!got) {
        try {
            java.lang.System.out.print(prompt);
            java.lang.String x = Main.scanner.nextLine();
            isbn = Main.normalizeISBN(x);
            got = true;
        } catch (java.lang.NumberFormatException e) {
            java.lang.System.out.println("ERROR: ISBN must contain some numbers(e.g. 143-2334-12)\n");
            got = false;
        }
    } 
    return isbn;
}