public boolean isMode(java.lang.String inmode) {
    if (((enginemode) == null) && (inmode.equals("anchorelocal"))) {
        return true;
    }
    if (enginemode.equals(inmode)) {
        return true;
    }
    return false;
}