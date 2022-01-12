public void addInvite(java.lang.String userName, java.lang.String userId) {
    if (userIDs.contains(userId))
        return ;
    
    userNameStrings.add(userName);
    userIDs.add(userId);
    draw();
}