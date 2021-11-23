private void validateIntegerInput() {
    do {
        java.lang.System.out.printf("What is the maximum amount of %s that should go in the jar: ", item);
        while (!(scanner.hasNextInt())) {
            java.lang.System.out.println("That's not an integer!");
            scanner.next();
            java.lang.System.out.printf("What is the maximum amount of %s that should go in the jar: ", item);
        } 
        maxItemsInJar = scanner.nextInt();
        if ((maxItemsInJar) <= 0) {
            java.lang.System.out.println("That's not a valid input!");
        }
    } while ((maxItemsInJar) <= 0 );
}