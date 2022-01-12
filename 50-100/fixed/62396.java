@java.lang.Override
public java.util.List<java.lang.Long> queryBookedPackageIds(java.util.Collection<java.lang.Long> userIds, long courseId, long courseSkuId) {
    if (userIds.isEmpty())
        return new java.util.ArrayList<java.lang.Long>();
    
    java.lang.String sql = ("SELECT PackageId FROM SG_BookedCourse WHERE UserId IN (" + (org.apache.commons.lang3.StringUtils.join(userIds, ","))) + ") AND CourseId=? AND CourseSkuId=? AND Status<>0";
    return queryLongList(sql, new java.lang.Object[]{ courseId , courseSkuId });
}