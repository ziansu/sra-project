public static void menuOptions() throws java.io.IOException {
    java.lang.String entry = io.File_IO.in.nextLine();
    switch (entry) {
        case "1" :
            io.File_IO.viewAllContacts();
            break;
        case "2" :
            io.File_IO.addContact();
            break;
        case "3" :
            io.File_IO.viewContact();
            break;
        case "4" :
            io.File_IO.deleteContact();
            break;
        case "5" :
            io.File_IO.exitProgram();
        default :
            io.File_IO.exitProgram();
    }
}