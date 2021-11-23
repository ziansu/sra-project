public static int getKeepLoginState() {
    return edu.chl.leep.model.LeepModel.getUserInfo().getInt("RadioButton", 0);
}