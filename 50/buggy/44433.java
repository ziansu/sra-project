private boolean isMac(java.lang.String val) {
    java.lang.String trueMacAddress = "([A-Fa-f0-9]{2}:){5}[A-Fa-f0-9]{2}";
    if (val.matches(trueMacAddress)) {
        return true;
    }else {
        return false;
    }
}