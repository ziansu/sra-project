@java.lang.Override
public com.sbu.dao.model.NeedyStudentEntity getByPhoneNumber(com.sbu.dao.model.NeedyStudentEntity needyStudent) {
    return needyStudentDAO.getByPhoneNumber(needyStudent.getPhoneNumber());
}