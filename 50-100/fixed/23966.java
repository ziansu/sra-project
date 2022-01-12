private java.lang.String prompt(java.lang.String text, java.lang.Class<?> type) {
    java.lang.String input = "";
    java.lang.System.out.print(text);
    input = scanner.nextLine();
    while (!(valid(input, type))) {
        java.lang.System.out.println(("Please enter a legal value of type: " + (type.getName())));
        java.lang.System.out.print(text);
        input = scanner.nextLine();
    } 
    return input;
}