public static com.tvntd.models.Profile createProfile(com.tvntd.models.User user) {
    com.tvntd.models.Profile profile = com.tvntd.models.Profile.createProfile(user);
    profile.setConnectList(new java.util.LinkedList<java.lang.String>());
    profile.setFollowList(new java.util.LinkedList<java.lang.String>());
    profile.setFollowerList(new java.util.LinkedList<java.lang.String>());
    profile.setChainLinks(new java.util.LinkedList<java.lang.Long>());
    return profile;
}