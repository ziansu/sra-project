public static void insertNewClass(java.lang.String className, java.lang.String classNumber, java.lang.String sectionNumber, java.lang.String professor) {
    ObjectLabEnterpriseSoftware.SQLMethods dbconn = new ObjectLabEnterpriseSoftware.SQLMethods();
    dbconn.insertIntoClasses(((className + " ") + classNumber), sectionNumber, professor);
    dbconn.closeDBConnection();
}