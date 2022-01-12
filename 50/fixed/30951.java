private java.lang.String[][] getMedicEffets() throws java.sql.SQLException {
    return library.Persistence.load("mediceffet");
}