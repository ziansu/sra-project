public geom.Point getToolTipPoint() {
    frame.UserFrame activeUser = getActiveUser();
    if (activeUser != null) {
        return getToolTipPoint(activeUser);
    }
    return getToolTipPoint(null);
}