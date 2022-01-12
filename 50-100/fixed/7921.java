private int getUsersRights() {
    com.google.firebase.auth.FirebaseUser user = com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser();
    if ((user == null) || ((mCheckList) == null)) {
        return 0;
    }
    java.lang.String email = user.getEmail();
    com.sunshinator.sharedchecklist.objects.UserRights rights = mCheckList.getAuthorizedUsers().get(email);
    if (rights == null) {
        return 0;
    }
    return rights.getRights();
}