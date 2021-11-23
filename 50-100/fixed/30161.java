private void sendUserRoles() {
    for (com.madalinadiaconu.arffrecorder.pcse_dd_14.actclient.CoordinatorClient.UserState currentUserState : lastUserStates) {
        com.madalinadiaconu.arffrecorder.pcse_dd_14.actclient.UserRole userRole = computedUserRoles.get(currentUserState.getUserId());
        if (userRole != null) {
            currentUserState.setRole(userRole);
        }else {
            currentUserState.setRole(null);
        }
    }
}