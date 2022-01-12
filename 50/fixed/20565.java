@java.lang.Override
public java.util.List<com.buptsse.spm.domain.Course> find(java.lang.String hql, java.lang.Object[] param) {
    return super.find("from Course where studentId= :param", param);
}