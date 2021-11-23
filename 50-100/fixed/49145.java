private java.lang.String validateNumspec(java.lang.String numspec) {
    while (true) {
        if (!(database.WorkOut.isNumeric(numspec))) {
            java.lang.System.out.println("Wrong format. Has to be a number");
            java.lang.System.out.print("Choose number of spectators: ");
            numspec = scanner.nextLine().trim();
        }else {
            return numspec;
        }
    } 
}