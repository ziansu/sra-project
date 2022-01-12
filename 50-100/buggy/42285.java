@java.lang.Override
public void updateSuggestedProjectStatus(com.spms.entity.StudentProject studentProject) {
    if (studentProject.getStatus().equals(StudentProjectStatus.ACCEPTED_BY_SUPERVISOR)) {
        studentProject.setSupervisor(studentProject.getSuggestedSupervisor());
        studentDAO.updateSuggestedProjectStatus(studentProject);
        studentDAO.setStudentProject(studentProject.getStudent(), studentProject.getId());
        studentDAO.updateSuggestedProjectStatus(studentProject);
    }
}