private void getMemberPersonalnumberFromUser() {
    java.lang.System.out.print("PERSONAL NUMBER (YYMMDDXXXX)\n>");
    input = scan.next();
    while (!(checkPersonalnumber(input))) {
        displayError("INCORRECT PERSONAL NUMBER!! PLEASE WRITE AGAIN");
        input = scan.next();
    } 
    memberPN = input;
}