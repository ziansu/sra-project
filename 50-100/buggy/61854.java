public void getMemberNameFromUser() {
    java.lang.System.out.print("NAME (Only Letters)\n>");
    input = (scan.next()) + (scan.nextLine());
    while (!(checkName(input))) {
        displayError("INCORRECT NAME!! PLEASE WRITE AGAIN");
        input = (scan.next()) + (scan.nextLine());
    } 
    memberName = input;
}