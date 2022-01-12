public static void DoMenu(java.util.Map<java.lang.Integer, java.lang.String> map, org.hibernate.Session session) {
    int choiceInt = 0;
    java.lang.System.out.println("Enter a number from the available options (enter -1 to exit): ");
    while (choiceInt != (-1)) {
        edu.sjsu.cs157bproject3.App.presentMenu(map);
        try {
            java.lang.System.out.println("Enter number: ");
            choiceInt = edu.sjsu.cs157bproject3.App.input.nextInt();
            edu.sjsu.cs157bproject3.App.input.nextLine();
            edu.sjsu.cs157bproject3.App.executeMenu(choiceInt, session);
        } catch (java.util.InputMismatchException e) {
            java.lang.System.out.println("Check your input! Make sure you enter an integer available in the menu.\n");
            edu.sjsu.cs157bproject3.App.input.nextLine();
        }
    } 
}