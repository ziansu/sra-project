public void setUser(com.teamtreehouse.domain.User user) {
    if (user != null) {
        user.addCreatedRecipe(this);
    }
    this.user = user;
}