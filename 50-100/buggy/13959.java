public com.iquanwai.confucius.biz.domain.course.progress.ClassMember loadActiveCourse(java.lang.String openid, java.lang.Integer courseId) {
    org.springframework.util.Assert.notNull(openid, "openid不能为空");
    com.iquanwai.confucius.biz.domain.course.progress.ClassMember classMember = classMemberDao.activeCourse(openid);
    if (classMember == null) {
        logger.error("{} has no active course", openid);
        return null;
    }
    com.iquanwai.confucius.biz.domain.course.progress.QuanwaiClass quanwaiClass = classDao.load(com.iquanwai.confucius.biz.domain.course.progress.QuanwaiClass.class, classMember.getClassId());
    if (quanwaiClass != null) {
        classMember.setClassProgress(quanwaiClass.getProgress());
    }
    return classMember;
}