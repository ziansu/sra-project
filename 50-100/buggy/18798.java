public static void testCopyConstructor(com.week2.solution.stack.StringStack tester) {
    com.week2.solution.stack.StringStack copy = new com.week2.solution.stack.StringStack(tester);
    java.lang.System.out.print("Kopie und Original identisch?");
    if (tester == copy) {
        java.lang.System.out.println(" --> ja");
    }else {
        java.lang.System.out.println(" --> nein");
    }
    java.lang.System.out.print("oberster Eintrag identisch?");
    if (tester.empty()) {
        java.lang.System.out.println(" -->keine Eintraege");
    }else
        if (tester.peek().equals(copy.peek())) {
            java.lang.System.out.println(" --> ja");
        }else {
            java.lang.System.out.println(" --> nein");
        }
    
}