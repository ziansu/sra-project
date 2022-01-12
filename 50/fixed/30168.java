public void logout() {
    if (!(edu.txstate.mobile.tracs.util.LoginStatus.userIsLoggedIn)) {
        return ;
    }
    edu.txstate.mobile.tracs.util.LoginStatus.userIsLoggedIn = false;
    updateObservers();
}