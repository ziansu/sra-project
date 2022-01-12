@java.lang.Override
public void markGradeToStudentProject(com.poseitech.assignment.entity.Student student, com.poseitech.assignment.entity.Project project, com.poseitech.assignment.entity.Grade grade) throws java.lang.Exception {
    com.poseitech.assignment.entity.StudentProjectGrade spg = new com.poseitech.assignment.entity.StudentProjectGrade();
    spg.setStudent(student);
    spg.setProject(project);
    spg.setGrade(grade);
    getSession().saveOrUpdate(spg);
}