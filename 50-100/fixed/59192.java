private void getBoatLengthFromUser() {
    java.lang.System.out.print("LENGTH(m)\n>");
    input = scan.next();
    while (!(checkBoatLength(input))) {
        displayError("INCORRECT LENGTH!! PLEASE WRITE AGAIN");
        input = scan.next();
    } 
    boatLength = java.lang.Double.parseDouble(input);
}