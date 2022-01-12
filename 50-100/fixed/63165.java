protected void checkLocations() {
    if ((origin) != null) {
        if ((originOffset) != null) {
            origin.addOffset(originOffset);
        }
    }
    if ((target) != null) {
        if ((targetOffset) != null) {
            target.addOffset(targetOffset);
        }
    }
}