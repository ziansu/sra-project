public boolean isBookRequestedAlready(int userId, int bookId) {
    java.sql.ResultSet rs = connector.executeSelectStatement(((("SELECT id FROM requested_books WHERE user_id LIKE " + userId) + " AND book_id LIKE ") + bookId));
    try {
        if (rs.isBeforeFirst())
            return true;
        
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(callib.Models.BorrowedBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return false;
}