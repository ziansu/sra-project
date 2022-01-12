private boolean isMac(java.lang.String val) {
    java.lang.String trueMacAddress = "([A-Fa-f0-9]{2}:){5}[A-Fa-f0-9]{2}";
    return val.matches(trueMacAddress);
}