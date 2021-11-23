protected void checkLocations() {
    if ((origin) != null) {
        if ((originOffset) != null) {
            origin.addOffset(originOffset);
        }
        origin.update();
    }
    if ((target) != null) {
        if ((targetOffset) != null) {
            target.addOffset(targetOffset);
        }
        target.update();
    }
}