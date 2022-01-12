@java.lang.Override
public boolean joinGroup(long userId, long courseId, long courseSkuId) {
    cn.momia.api.im.dto.Group group = queryGroup(courseId, courseSkuId);
    if (!(group.exists()))
        return false;
    
    if (doJoinGroup(userId, group.getGroupId(), group.getGroupName())) {
        logGroupMembers(group.getGroupId(), com.google.common.collect.Sets.newHashSet(userId), false);
        return true;
    }
    return false;
}