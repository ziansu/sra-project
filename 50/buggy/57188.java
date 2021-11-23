private synchronized void addModsetString(java.lang.String rt) {
    if ((rt.length()) < 5) {
    }else {
        (modsetCounter)++;
        com.google.gwt.user.client.Window.alert(rt);
        modString.add(rt);
    }
}