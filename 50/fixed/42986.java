public java.lang.String getAbsoluteLink() {
    if (getLink().contains("%USERPROFILE%")) {
        return getLink().replace("%USERPROFILE%", java.lang.System.getProperty("user.home"));
    }else {
        return Link;
    }
}