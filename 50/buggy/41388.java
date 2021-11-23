public java.lang.String takeNumberToMark() {
    java.lang.String choice = "";
    do {
        java.lang.System.out.println("Enter proper number to mark: ");
        choice = View.input.next();
    } while (!(Str.matches("^([1-9][0-9]*)$")) );
}