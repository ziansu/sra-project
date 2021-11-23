@java.lang.Override
public boolean joinGroup(long courseId, long courseSkuId, long userId) {
    cn.momia.api.im.dto.Group group = queryGroup(courseId, courseSkuId);
    if (!(group.exists()))
        return false;
    
    if (doJoinGroup(group.getGroupId(), group.getGroupName(), userId)) {
        logGroupMembers(group.getGroupId(), com.google.common.collect.Sets.newHashSet(userId), false);
        return true;
    }
    return false;
}