public static void checkAges(IntArrayBag ages) {
    int userInput;
    java.lang.System.out.println("Type those ages in again.");
    java.lang.System.out.println("Press return after each age.");
    while ((ages.size()) > 0) {
        java.lang.System.out.print("next age: ");
        userInput = Driver.stdin.nextInt();
        if ((ages.countOccurrences(userInput)) == 0) {
            java.lang.System.out.println("No, that age does not occur.");
        }else {
            java.lang.System.out.println("removing that age");
            ages.remove(userInput);
        }
    } 
}