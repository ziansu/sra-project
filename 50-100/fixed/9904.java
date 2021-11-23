@java.lang.Override
public boolean leaveGroup(long userId, long courseId, long courseSkuId) {
    cn.momia.api.im.dto.Group group = queryGroup(courseId, courseSkuId);
    if (!(group.exists()))
        return false;
    
    if (doLeaveGroup(userId, group.getGroupId())) {
        deleteGroupMembersLog(group.getGroupId(), com.google.common.collect.Sets.newHashSet(userId));
        return true;
    }
    return false;
}