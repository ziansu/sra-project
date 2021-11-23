public void setSchoolGradeInfo() throws java.sql.SQLException {
    java.lang.String query = ((((("select * from find_subject_school_grade_class_teacher_for_school(" + (institutionID)) + ",") + (userID)) + ",") + (databaseConnection.BasicInformation.principalUserType)) + ", 'school_grade', NULL,NULL,NULL, NULL);";
    stmt = dbConnection.createStatement();
    java.sql.ResultSet rs = stmt.executeQuery(query);
    while (rs.next()) {
        schoolGrades.put(rs.getString("object_name"), rs.getString("object_id"));
    } 
    java.lang.System.out.print("Grades");
    java.lang.System.out.println(schoolGrades);
}