public static models.UserModel getTopParentUser(models.UserModel user) {
    if (null == (user.parent_team_member)) {
        return user;
    }else {
        return models.UserModel.getTopParentUser(user.parent_team_member);
    }
}