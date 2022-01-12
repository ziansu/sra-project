public static int getInt(java.util.Scanner entry, java.lang.String prompt) {
    int i = 0;
    boolean isValid = false;
    while (isValid == false) {
        java.lang.System.out.print(prompt);
        if (entry.hasNextInt()) {
            i = entry.nextInt();
            isValid = true;
            return i;
        }else {
            java.lang.System.out.println("Error! Invalid integer value. Try again.");
        }
        entry.nextLine();
    } 
    return i;
}