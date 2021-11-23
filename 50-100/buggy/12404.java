private java.util.Map<java.lang.String, java.lang.String> getLimitedUserInfo() {
    java.util.Map info = new java.util.HashMap<>();
    info.put("uid", getUid());
    info.put("firstName", getFirstName());
    info.put("lastName", getLastName());
    info.put("middleName", getMiddleName());
    info.put("profilePicsUrls", getNewUserProfilePicUri());
    return info;
}