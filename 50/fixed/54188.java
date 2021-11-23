protected void removeBackgrounds() {
    backgroundID = -1;
    if ((back_obj) != null) {
        back_obj.release();
        back_obj = null;
    }
}