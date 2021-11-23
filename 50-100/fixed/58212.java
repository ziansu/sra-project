public static void main(java.lang.String[] args) {
    char letter;
    int a;
    final int MIN = 65;
    final int MAX = 122;
    final int STOPLINE1 = 85;
    final int STOPLINE2 = 122;
    for (a = MIN; a <= MAX; a++) {
        letter = ((char) (a));
        java.lang.System.out.print(("  " + letter));
        if ((a == STOPLINE1) || (a == STOPLINE2))
            java.lang.System.out.println();
        
    }
    java.lang.System.out.println("\nEnd of application");
}