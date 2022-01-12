public com.crossballbox.model.UserInfo saveUserInfo(com.crossballbox.model.FamilyData familyData, com.crossballbox.model.UserHealthyState userHealthyState, com.crossballbox.model.UserAdditionalInfo userAdditionalInfo, java.lang.String imagePath, com.crossballbox.model.User user) {
    int userId = user.getId();
    com.crossballbox.model.UserInfo userInfo = user.getUserInfo();
    if (userInfo == null) {
        userInfo = new com.crossballbox.model.UserInfo(userId);
    }
    userInfo.setFamilyData(familyData);
    userInfo.setUserHealthyState(userHealthyState);
    userInfo.setUserAdditionalInfo(userAdditionalInfo);
    userInfo.setUser(user);
    userInfo.setImagePath(imagePath);
    userInfoDAO.save(userInfo);
    return userInfo;
}