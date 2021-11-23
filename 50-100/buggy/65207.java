private java.util.List<java.lang.Integer> getNewCommunityID(int userID) {
    java.util.Set<java.lang.Integer> knownIDs = mesController.getSession().getCommunityMap().keySet();
    java.util.List<java.lang.Integer> allIDs = de.szut.dqi12.cheftrainer.server.databasecommunication.DatabaseRequests.getCummunityIDsForUser(userID);
    java.util.List<java.lang.Integer> retval = new java.util.ArrayList<java.lang.Integer>();
    for (java.lang.Integer i : knownIDs) {
        if (allIDs.contains(i)) {
            retval.add(i);
        }
    }
    return retval;
}