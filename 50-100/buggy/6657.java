private boolean teamHasSpace(int userId, int teamId) {
    try {
        se.plushogskolan.casemanagement.model.User user = userRepository.getUserById(userId);
        if ((user.getTeamId()) == teamId) {
            return true;
        }else {
            return numberOfUsersInTeamLessThanTen(teamId);
        }
    } catch (se.plushogskolan.casemanagement.exception.RepositoryException e) {
        return numberOfUsersInTeamLessThanTen(teamId);
    }
}