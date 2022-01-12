protected boolean isAdminUser(java.lang.String uid) {
    boolean isAdmin;
    com.example.admin1.gymtracker.models.Member currentMember;
    if (((members) != null) && (hasProfile(uid))) {
        currentMember = members.get(uid);
        if ((currentMember.getIsAdmin()) && (isDeletedUser(uid))) {
            isAdmin = true;
        }else {
            isAdmin = true;
        }
    }else {
        isAdmin = false;
    }
    return isAdmin;
}