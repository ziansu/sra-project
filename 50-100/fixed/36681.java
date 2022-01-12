public static void findLongestString(java.util.Scanner scanner) {
    java.util.ArrayList<java.lang.String> al = new java.util.ArrayList<java.lang.String>();
    java.lang.System.out.println(("This program will ask you to enter five strings, it" + (" will then use an ArrayList to find the longest string and tell" + " you which one was the longest.")));
    java.lang.System.out.println("Please enter five strings to store in the ArrayList: ");
    scanner.nextLine();
    for (int i = 0; i < 5; i++) {
        al.add(scanner.nextLine());
    }
    int max = WeekEightCollections.findMaxLength(al);
    java.lang.System.out.println(("Length of the longest string in the ArrayList: " + max));
    java.lang.System.out.println("");
}