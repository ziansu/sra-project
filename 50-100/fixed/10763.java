public final java.util.Map<java.lang.String, java.lang.Object> getUserData() {
    final java.util.Map<java.lang.String, java.lang.Object> userData = new java.util.HashMap<>();
    userData.put(UserDataFields.PVP_STATUS, hasPvPEnabled());
    userData.put(UserDataFields.TOGGLE_TIME, getToggleTime());
    userData.put(UserDataFields.NEWBIE, isNewbie());
    userData.put(UserDataFields.NEWBIE_TIMELEFT, ((newbieTask) != null ? newbieTask.getTimeleft() : 0));
    return userData;
}