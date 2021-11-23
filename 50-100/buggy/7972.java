@java.lang.Override
public java.util.List<com.pilotproject.entity.User> findUsers(java.lang.String username, java.lang.String email, java.util.Date fromDate, java.util.Date toDate) {
    if (com.pilotproject.utils.PilotUtils.isEmpty(fromDate)) {
        fromDate = new java.util.Date();
    }
    if (com.pilotproject.utils.PilotUtils.isEmpty(toDate)) {
        toDate = new java.util.Date();
    }
    java.lang.String userLogged = com.pilotproject.utils.PilotUtils.getUserNameLogeed();
    return this.userRepository.findUsersAndUsernameNot(userLogged, username, email, fromDate, toDate);
}