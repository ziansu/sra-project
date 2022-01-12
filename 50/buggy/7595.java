public java.lang.String getLevelStr() {
    if ((getCalcedLevel()) != 0) {
        return ((getCalcedLevel()) + "/") + (level);
    }else {
        return getString(R.string.none);
    }
}