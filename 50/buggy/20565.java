@java.lang.Override
public java.util.List<com.buptsse.spm.domain.Course> find(java.lang.String hql, com.buptsse.spm.domain.Course[] param) {
    return super.find("from Course where studentId= :param", param);
}