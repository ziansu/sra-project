private void init(java.lang.String hostsList, java.lang.String facility) {
    this.hostsList = hostsList;
    this.facility = facility;
    if ("/".equals(facility)) {
        this.length = 1;
    }else {
        this.length = ((facility.length()) + ((facility.charAt(0)) == '/' ? 0 : 1)) - (facility.endsWith("/") ? 1 : 0);
    }
}