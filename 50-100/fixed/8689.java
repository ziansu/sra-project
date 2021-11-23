public ulm.university.news.controller.Ballot getBallot(java.lang.String accessToken, int groupId, int ballotId, boolean withSubresources) throws ulm.university.news.util.exceptions.ServerException {
    ulm.university.news.controller.Ballot ballot;
    ulm.university.news.controller.User requestor = verifyUserAccess(accessToken);
    ulm.university.news.controller.GroupController.logger.debug(("The requestor, i.e. the user with id {}, requests the ballot with the id {} from the group with" + " the id {}."), requestor.getId(), ballotId, groupId);
    verifyGroupExistenceViaDB(groupId);
    verifyParticipationInGroupViaDB(groupId, requestor.getId());
    ballot = getBallot(groupId, ballotId, withSubresources);
    return ballot;
}