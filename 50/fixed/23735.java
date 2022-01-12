@java.lang.Override
public java.util.Date getInputDate(java.lang.String message) {
    while (true) {
        try {
            return super.getInputDate(message);
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.System.out.println("Invalid input. Try again.");
        }
    } 
}