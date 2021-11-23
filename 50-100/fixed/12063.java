private void getMemberIDFromUser() {
    java.lang.System.out.print("PLEASE TYPE THE MEMBER ID\n>");
    input = scan.next();
    while (!(checkMemberID(input))) {
        displayError("INVALID ID");
        input = scan.next();
    } 
    memberID = java.lang.Integer.parseInt(input);
}