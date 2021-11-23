public seu.domain.Library mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    return new seu.domain.Library(rs.getInt("studentId"), rs.getString("bookName"), rs.getInt("bookId"), rs.getDate("period"), rs.getDate("returnDate"));
}