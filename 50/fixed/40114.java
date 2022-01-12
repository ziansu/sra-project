private void overdueCheck(int overdueCheck) {
    assert overdueCheck < (application.gui.ListItem.overdueCheckVariable);
    if (overdueCheck < (application.gui.ListItem.overdueCheckVariable)) {
        setOverdueItems();
    }
}