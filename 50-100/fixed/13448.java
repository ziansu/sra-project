public void deleteProfile(java.lang.String name) {
    if (profiles.containsKey(name)) {
        FacePamphletProfile profileToRemove = profiles.get(name);
        java.util.Iterator<java.lang.String> iterator = profileToRemove.getFriends();
        if (iterator != null) {
            while (iterator.hasNext()) {
                java.lang.String friendName = iterator.next();
                FacePamphletProfile friendsProfile = profiles.get(friendName);
                friendsProfile.removeFriend(name);
            } 
        }
        profiles.remove(name);
    }
}