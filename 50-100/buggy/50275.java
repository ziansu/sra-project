public boolean testIfJustFilled() {
    if (((waterVolume) + ((com.jarmo.rain.model.Section.THRESHOLD_WATER) * 2.0F)) >= (volume)) {
        if (filled) {
            return false;
        }
        filled = true;
        return true;
    }
    filled = false;
    return false;
}