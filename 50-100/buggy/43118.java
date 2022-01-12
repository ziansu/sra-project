public static void option4() throws java.sql.SQLException {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print("Enter the ISBN of the book to remove: ");
    java.lang.Integer isbn = scanner.nextInt();
    java.lang.String remove = "DELETE FROM books WHERE isbn=?";
    Client.con.setAutoCommit(false);
    Client.prepStatement = Client.con.prepareStatement(remove);
    Client.prepStatement.setString(1, isbn);
    Client.con.commit();
    java.lang.System.out.println("DONE.");
}