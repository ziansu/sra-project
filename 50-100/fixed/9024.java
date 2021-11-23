private void DecideWhereToGoBackTo() {
    if ((motive) != null) {
        if ((motive.equals("pre-trip")) || (motive.equals("log-in"))) {
            startLogOutService();
            navigateToLogin();
        }else {
            java.lang.String newStatus = _statusToDisplay;
            storeStatusInMemory(newStatus);
            navigateToMainMenu(newStatus);
        }
    }else {
        java.lang.String newStatus = _statusToDisplay;
        storeStatusInMemory(newStatus);
        navigateToMainMenu(newStatus);
    }
}