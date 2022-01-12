public static boolean loginUser(java.lang.String userName, java.lang.String password, javafx.scene.text.Text attemptsLeft) {
    sample.Models.LoginUser.checkTries(attemptsLeft, userName);
    try {
        return (((sample.Models.LoginUser.checkFile()) && (sample.Models.LoginUser.checkUserName(userName))) && (sample.Models.LoginUser.checkPassWord(password, userName))) && (sample.Models.LoginUser.check);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Error while logging in user");
        return false;
    }
}