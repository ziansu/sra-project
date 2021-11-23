@java.lang.Override
public void batchCancel(java.util.Collection<java.lang.Long> userIds, long courseId, long courseSkuId) {
    if (userIds.isEmpty())
        return ;
    
    java.lang.String sql = ("UPDATE SG_BookedCourse SET Status=0 WHERE UserId IN (" + (org.apache.commons.lang3.StringUtils.join(userIds, ","))) + ") AND CourseId=? AND CourseSkuId=? AND Status<>0";
    update(sql, new java.lang.Object[]{ courseId , courseSkuId });
}