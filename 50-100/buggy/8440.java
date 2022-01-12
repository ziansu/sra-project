public static void printIndexBoard() {
    java.lang.System.out.println();
    for (int i = 0; i < 9; i++) {
        if (((i % 3) == 0) && (i != 0)) {
            java.lang.System.out.println();
            java.lang.System.out.println("-------------");
        }
        java.lang.System.out.println((" | " + (i + 1)));
    }
    java.lang.System.out.println();
}