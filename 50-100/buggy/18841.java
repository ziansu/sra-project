public static boolean canPerformMemberLevelOperation(int targetOperationMemberLevel) throws com.loocha.exception.ServerInternalException {
    if ((com.loocha.bean.MemberLevel.Level_Empty) == targetOperationMemberLevel) {
        return false;
    }
    long user_id = com.loocha.resources.ServerUtil.getLoginUserId();
    int level = com.loocha.bean.MemberLevel.Level_Empty;
    if (user_id > 0) {
        level = com.loocha.dao.LoochaDAOFactory.getInstance().getUserDAO().queryUserById(user_id).getMemberLevel();
    }
    return (level & targetOperationMemberLevel) > 0;
}