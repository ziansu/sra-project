public void linkSubjectWithCourse(int courseID) throws java.sql.SQLException {
    java.lang.String sql = "insert into coursesubject values(?,?);";
    java.sql.PreparedStatement ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
    java.lang.System.out.println(sql);
    ps.setInt(1, courseID);
    ps.setInt(2, this.getSubjectID());
    ps.executeUpdate();
}