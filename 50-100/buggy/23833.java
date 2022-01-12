private static void function8(FaceSpace fs, java.util.Scanner in) {
    java.lang.System.out.println("Displaying Messages.");
    java.lang.System.out.println("Please enter the user's first name");
    java.lang.String fname = in.nextLine();
    fname = in.nextLine();
    java.lang.System.out.println("Please enter the user's last name");
    java.lang.String lname = in.nextLine();
    java.lang.System.out.println(((fname + "  ") + lname));
    long userID = fs.getUserID(fname, lname);
    fs.displayMessages(userID);
}