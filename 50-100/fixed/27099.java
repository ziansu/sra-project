public void setSchoolClassesInfo() throws java.sql.SQLException {
    java.lang.String query = ((((("select * from find_subject_school_grade_class_teacher_for_school (" + (institutionID)) + ", ") + (userID)) + ",") + (databaseConnection.BasicInformation.principalUserType)) + ", 'class', NULL, NULL, NULL, NULL);";
    stmt = dbConnection.createStatement();
    java.sql.ResultSet rs = stmt.executeQuery(query);
    while (rs.next()) {
        schoolClasses.put(rs.getString("object_name"), rs.getString("object_id"));
    } 
}