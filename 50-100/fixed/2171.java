@org.springframework.transaction.annotation.Transactional
public in.jdsoft.educationmanagement.school.model.Student getActiveStudentByAdmissionNoWithoutInvoices(java.lang.String admissionNo) {
    in.jdsoft.educationmanagement.school.model.StudentStatus studentStatus = studentStatusDAO.getStudentStatusById(1);
    in.jdsoft.educationmanagement.school.model.Student student = studentDAO.getActiveStudentByAdmissionNo(admissionNo, studentStatus);
    if (student != null) {
        if (checkForStudentInvoiceGenerated(student)) {
            student = null;
        }else {
            org.hibernate.Hibernate.initialize(student.getStudentClass());
            org.hibernate.Hibernate.initialize(student.getSection());
        }
    }else {
        student = null;
    }
    return student;
}