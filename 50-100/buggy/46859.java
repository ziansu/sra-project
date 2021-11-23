private boolean askYNQuestion() {
    while (true) {
        java.lang.String choice = nl.saxion.bd.opdracht1.DatabaseHandler.scanner.next();
        if (choice.equals("J")) {
            return true;
        }else
            if (choice.equals("N")) {
                return false;
            }else {
                nl.saxion.bd.opdracht1.Menu.print("Vul J of N in.");
            }
        
    } 
}