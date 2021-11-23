public boolean nextStateReady() {
    if ((getLastLightValue()) < (util.GlobalValues.AVG_LIGHT)) {
        return true;
    }else {
        return false;
    }
}