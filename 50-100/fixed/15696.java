private void doAutoLogin() {
    loadCityStateFromServer();
    if ((br.edu.ifce.swappers.swappers.miscellaneous.utils.AndroidUtils.userHasBeenLoaded(this)) && (br.edu.ifce.swappers.swappers.miscellaneous.utils.AndroidUtils.isNetworkAvailable(this))) {
        MockSingleton.INSTANCE.user = br.edu.ifce.swappers.swappers.miscellaneous.utils.AndroidUtils.loadUser(this);
        br.edu.ifce.swappers.swappers.miscellaneous.utils.AndroidUtils.startMainActivity(this);
    }else {
        br.edu.ifce.swappers.swappers.miscellaneous.utils.AndroidUtils.startSignInActivity(this);
    }
}