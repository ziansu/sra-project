public static com.unique.countsystem.Student createStudentModel(java.lang.String name, java.lang.String studentId, java.lang.String _class) throws java.lang.IllegalArgumentException {
    studentId = studentId.trim();
    if (!(com.unique.countsystem.database.DbHelper.checkStudentId(studentId))) {
        throw new java.lang.IllegalArgumentException("studentId is illegal");
    }
    _class = _class.trim();
    com.unique.countsystem.database.DbHelper.check_class(_class);
    return new com.unique.countsystem.Student(null, name, studentId, _class);
}