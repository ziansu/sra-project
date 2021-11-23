private java.lang.String prompt(java.lang.String text, java.lang.Class<?> type) {
    java.lang.String input = "";
    input = scanner.nextLine();
    while (!(valid(input, type))) {
        java.lang.System.out.println(("Please enter a legal value of type: " + (type.getName())));
        input = scanner.nextLine();
    } 
    return input;
}