public boolean isMode(java.lang.String inmode) {
    if (null != inmode) {
        if (null != (enginemode)) {
            if (enginemode.equals(inmode)) {
                return true;
            }
        }else {
            if (inmode.equals("anchorelocal")) {
                return true;
            }
        }
    }
    return false;
}