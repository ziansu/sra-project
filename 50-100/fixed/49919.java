@java.lang.Override
public com.liferay.portal.kernel.comment.DiscussionCommentIterator getThreadDiscussionCommentIterator(int from) {
    java.util.List<com.liferay.message.boards.kernel.model.MBMessage> messages = _treeWalker.getMessages();
    int[] range = _treeWalker.getChildrenRange(getMessage());
    return new com.liferay.message.boards.comment.internal.MBDiscussionCommentImpl.MBDiscussionCommentIterator(messages, ((range[0]) + from), range[1], _treeWalker);
}