@java.lang.Override
public com.liferay.portal.kernel.comment.DiscussionComment fetchDiscussionComment(long userId, long commentId) throws com.liferay.portal.kernel.exception.PortalException {
    com.liferay.message.boards.kernel.model.MBMessage mbMessage = _mbMessageLocalService.fetchMBMessage(commentId);
    if (mbMessage == null) {
        return null;
    }
    com.liferay.message.boards.kernel.model.MBMessageDisplay messageDisplay = _mbMessageLocalService.getDiscussionMessageDisplay(userId, mbMessage.getGroupId(), mbMessage.getClassName(), mbMessage.getClassPK(), WorkflowConstants.STATUS_ANY, new com.liferay.message.boards.kernel.util.comparator.MessageThreadComparator());
    return getDiscussionComment(userId, messageDisplay);
}