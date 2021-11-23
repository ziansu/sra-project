public int login(int studentId, java.lang.String passwd) {
    try {
        seu.domain.Student student = studentDao.queryStudentByStudentID(studentId);
        if ((student.getPassword()) == passwd)
            return 1;
        else
            return 0;
        
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return -1;
    }
}