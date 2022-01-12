public void getBoatIndexFromUser() {
    if ((registry.lookUpMember(memberID).getNumberOfBoats()) == 0) {
        displayError("THIS MEMBER HAVE NO BOAT CURRENTLY!!");
        displaySelectedMember(registry.lookUpMember(memberID));
        displayUpdateMemberInstructions();
        return ;
    }
    java.lang.System.out.print("PLEASE ENTER THE BOAT #\n>");
    input = scan.next();
    while (!(checkBoatIndex(input, registry.lookUpMember(memberID)))) {
        displayError("INVALID #");
        input = scan.next();
    } 
    boatIndex = java.lang.Integer.parseInt(input);
}