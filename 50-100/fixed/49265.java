public void incorrectPassword(int numTimesWrong) {
    if (numTimesWrong < 3) {
        java.lang.System.out.println((((("You have entered the wrong password " + numTimesWrong) + " times.\n") + "Please be aware that accounts are locked after three incorrect attempts. ") + "To have your password reset, please contact your system administrator."));
    }
    if (numTimesWrong >= 3) {
        user.freezeUser();
        java.lang.System.out.println(("Your account has been locked due to 3 unsuccessful login attempts.\n" + "Please contact your system administrator to have your account unlocked."));
    }
}