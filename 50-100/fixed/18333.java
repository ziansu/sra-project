public boolean commitCourseByCourseId(java.lang.String courseId) {
    java.lang.String sql = "update course set commitStatus = '已提交' where id = ?";
    java.util.List<java.lang.Object> param = new java.util.ArrayList<>();
    param.add(courseId);
    boolean flag = false;
    try {
        flag = jdbcUtil.updateByPreparedStatement(sql, param);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return flag;
}