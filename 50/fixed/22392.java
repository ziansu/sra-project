@java.lang.Override
public java.lang.Integer getInputInteger(java.lang.String message) {
    while (true) {
        try {
            return super.getInputInteger(message);
        } catch (java.lang.NumberFormatException e) {
            java.lang.System.out.println("Invalid input. Try again.");
        }
    } 
}