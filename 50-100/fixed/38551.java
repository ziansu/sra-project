private void deleteGroupDeadlineAndCopyDuplicateToGroupUsers(java.lang.Long groupId, myddl.entity.Deadline deadline, java.util.List<myddl.entity.UserInfo> groupUsers) {
    for (myddl.entity.UserInfo userInfo : groupUsers) {
        myddl.entity.Deadline duplicate = deadline.duplicate();
        deadlineMapper.insertSelective(duplicate);
        long duplicateId = duplicate.getDeadlineId();
        deadlineMapper.insertUserDeadline(userInfo.getUserId(), duplicateId);
    }
    groupMapper.deleteGroupDeadlineByGroupIdAndDeadlineId(groupId, deadline.getDeadlineId());
    deadlineMapper.deleteByPrimaryKey(deadline.getDeadlineId());
}