@java.lang.Override
public boolean leaveGroup(long courseId, long courseSkuId, long userId) {
    cn.momia.api.im.dto.Group group = queryGroup(courseId, courseSkuId);
    if (!(group.exists()))
        return false;
    
    if (doLeaveGroup(group.getGroupId(), userId)) {
        deleteGroupMembersLog(group.getGroupId(), com.google.common.collect.Sets.newHashSet(userId));
        return true;
    }
    return false;
}