public void setUserFiltered(java.util.List<UserWrapper> userFiltered) {
    java.util.List<UserWrapper> oldValue = this.userFiltered;
    this.userFiltered = userFiltered;
    firePropertyChange("userFiltered", oldValue, this.userFiltered);
    if (!(userFiltered.isEmpty())) {
        setShowingUsers(true);
    }else {
        setShowingUsers(false);
    }
}