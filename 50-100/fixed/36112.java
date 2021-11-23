public java.lang.String getBackgroundColor() {
    if ((getBroken()) || ((getFailCount()) > 0)) {
        if (getUnclaimedJobs().isEmpty()) {
            return "orange";
        }else {
            return "red";
        }
    }else {
        return "green";
    }
}