public void logout() {
    edu.txstate.mobile.tracs.util.LoginStatus.userIsLoggedIn = false;
    updateObservers();
}