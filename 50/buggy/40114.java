private void overdueCheck(int overdueCheck) {
    if (overdueCheck < (application.gui.ListItem.overdueCheckVariable)) {
        setOverdueItems();
    }
}