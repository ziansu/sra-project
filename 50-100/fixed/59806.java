public tw.wee.user.entity.UserProfile translateToProfile(tw.wee.user.domain.User user) {
    tw.wee.user.entity.UserProfile userProfile = new tw.wee.user.entity.UserProfile();
    userProfile.setName(user.getName());
    userProfile.setEmail(user.getEmail());
    userProfile.setBirth(user.getBirth());
    userProfile.setGender(user.getGender().getValue());
    userProfile.setPassword(user.getPassword());
    return userProfile;
}