public void createTables() {
    try {
        stat.execute("CREATE TABLE CourseParticipantTable (Professor TEXT, Course TEXT, Student TEXT, OverallGrade REAL)");
        stat.execute("CREATE TABLE AssignmentTable (Professor TEXT, Course TEXT, Assignment TEXT, TotalPossible REAL)");
        stat.execute("CREATE TABLE GradeTable (Student TEXT, Professor TEXT, Course TEXT, Assignment TEXT, Grade REAL)");
        stat.execute("CREATE TABLE LoginTable (Person TEXT, Type TEXT, Password TEXT)");
        stat.execute("CREATE TABLE CourseTable (Professor TEXT, Course TEXT)");
    } catch (java.sql.SQLException sq) {
        return ;
    }
}