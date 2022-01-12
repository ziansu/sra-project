public void addMark(hu.inf.unideb.rft.ejournal.vo.StudentVo student, hu.inf.unideb.rft.ejournal.vo.SubjectVo subject, int grade) {
    hu.inf.unideb.rft.ejournal.vo.MarkVo mark = new hu.inf.unideb.rft.ejournal.vo.MarkVo();
    mark.setTeacher(current.getTeacher().getTeacher());
    mark.setStudent(student);
    mark.setValue(grade);
    mark.setSubject(subject);
    markService.saveMark(mark);
}