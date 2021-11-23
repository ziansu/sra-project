public boolean commitCourseByCourseId(java.lang.String courseId) {
    java.lang.String sql = "update course set commitStatus = '已提交' where id = ?";
    java.util.List<java.lang.Object> params = new java.util.ArrayList<>();
    params.add(courseId);
    boolean flag = false;
    try {
        flag = jdbcUtil.updateByPreparedStatement(sql, params);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return flag;
}