private java.util.List<java.lang.String> getFriendsData() {
    java.util.List<java.lang.String> data = new java.util.LinkedList<>();
    if ((friends) != null) {
        for (edu.njit.fall15.team1.cs673messenger.models.Friend friend : friends) {
            data.add(friend.getProfileName());
        }
    }
    return data;
}