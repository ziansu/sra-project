public boolean linkIsDocked() {
    if ((robotTaking()) != null) {
        return (robotTaking().getDockingStation()) == (this);
    }else {
        return false;
    }
}