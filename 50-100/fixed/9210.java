@java.lang.Override
public java.lang.Boolean delete(int id) throws com.nextbook.exceptions.AuthRequiredException, com.nextbook.exceptions.ForbiddenException, com.nextbook.exceptions.NoSuchEntityException {
    com.nextbook.domain.entity.comment.CommentEntity commentEntity = commentDao.getNotNull(id);
    commentEntity.setStatus(CommentStatusesEnum.DELETED);
    if ((sessionUtils.allowedForUserWithRole(RolesEnum.admin)) || (commentAvailabilityService.isCommentAuthorSession(commentEntity))) {
        return (commentDao.update(commentEntity).getStatus().compareTo(CommentStatusesEnum.DELETED)) == 0;
    }
    return false;
}