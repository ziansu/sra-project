public ulm.university.news.controller.Option getOption(java.lang.String accessToken, int groupId, int ballotId, int optionId) throws ulm.university.news.util.exceptions.ServerException {
    ulm.university.news.controller.Option option;
    ulm.university.news.controller.User requestor = verifyUserAccess(accessToken);
    ulm.university.news.controller.GroupController.logger.info(("The requestor, i.e. the user with id {}, requests the option with id {} for the ballot with id " + "{} which belongs to the group with id {}."), requestor.getId(), optionId, ballotId, groupId);
    verifyGroupExistenceViaDB(groupId);
    verifyParticipationInGroupViaDB(groupId, requestor.getId());
    verifyBallotExistenceViaDB(groupId, ballotId);
    option = getOption(ballotId, optionId);
    return option;
}