public static miniRPG.User startUser() {
    miniRPG.Play.user = null;
    try {
        miniRPG.Play.user = miniRPG.Play.loadData();
        if ((miniRPG.Play.user) == null) {
            miniRPG.Play.user = new miniRPG.User(100, 100, 0, 10, 10, 10);
            miniRPG.Play.setUpUserInfo();
        }
        if ((miniRPG.Play.user.getCurrentHealth()) < 1) {
            miniRPG.Play.user.setCurrentHealth(miniRPG.Play.user.getTotalHealth());
        }
    } catch (java.io.IOException e) {
    }
    return miniRPG.Play.user;
}