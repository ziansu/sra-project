public java.lang.String getLevelStrForActivity() {
    if ((getCalcedLevel()) != 0) {
        return (((getCalcedLevel()) + "% (raw=") + (level)) + ")";
    }else {
        return getString(R.string.none);
    }
}