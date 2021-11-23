public static void insertNewClass(java.lang.String className, java.lang.String classNumber, java.lang.String sectionNumber, java.lang.String professor) {
    ObjectLabEnterpriseSoftware.SQLMethods dbconn = new ObjectLabEnterpriseSoftware.SQLMethods();
    java.lang.System.out.println(((((((className + " ") + classNumber) + " ") + sectionNumber) + " ") + professor));
    dbconn.insertIntoClasses(((className + " ") + classNumber), sectionNumber, professor);
    dbconn.closeDBConnection();
}