@java.lang.Override
public java.lang.String getInput() {
    java.util.Scanner keyboard = new java.util.Scanner(java.lang.System.in);
    boolean valid = false;
    java.lang.String value = null;
    while (!valid) {
        java.lang.System.out.println("Enter your selection here:");
        value = keyboard.nextLine();
        value = value.trim();
        if ((value.length()) < 1) {
            java.lang.System.out.println("Invalid selection - the selection should be one letter");
            continue;
        }
        break;
    } 
    return value;
}