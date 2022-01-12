public static void printHand(uno.deal play1) {
    int display = 0;
    for (int x = 0; x < (play1.getSize()); x++) {
        display = x + 1;
        java.lang.System.out.println(((display + ". ") + (play1.getCard(x))));
    }
    display++;
    java.lang.System.out.println((display + ". Draw Card"));
}