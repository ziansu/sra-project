@java.lang.Override
public void displayDeleteMemberDetails() {
    displayCompactList();
    java.lang.System.out.print("Enter the memebr # \n>");
    int input = scan.nextInt();
    if ((input <= 0) || (input > (reg.getRegistry().size()))) {
        java.lang.System.err.println("Invalid Member #\n");
        displayDeleteMemberDetails();
    }
    reg.deleteMember((input - 1));
    java.lang.System.out.println("****** Member Deleted!! *******");
}