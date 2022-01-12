public void setCheckedIn(java.lang.Boolean checkedIn) {
    this.checkedIn = checkedIn;
    if (checkedIn) {
        if ((checkInTime) == null) {
            checkInTime = new java.util.Date();
        }
    }else {
        checkInTime = null;
    }
}