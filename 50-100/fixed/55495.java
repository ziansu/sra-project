public boolean isPassVerifyTest(java.lang.Long bookId, java.lang.Long studentId) {
    java.util.List<com.syzton.sunread.model.exam.Exam> list = repository.findByStudentIdAndBookId(studentId, bookId);
    for (int i = 0; i < (list.size()); i++) {
        if (list.get(i).isPass()) {
            return true;
        }
    }
    return false;
}