public geom.Point getToolTipPoint() {
    frame.UserFrame activeUser = getActiveUser();
    if (activeUser != null) {
        getToolTipPoint(activeUser);
    }
    return getToolTipPoint(null);
}