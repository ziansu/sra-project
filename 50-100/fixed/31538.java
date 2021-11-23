private fi.cosky.sdk.Link parseLocationLinkFromString(java.lang.String s) {
    if (s.contains("/tokens"))
        return new fi.cosky.sdk.Link("location", s, "GET", "", true);
    else
        s = s.substring(s.lastIndexOf("/users"));
    
    return new fi.cosky.sdk.Link("location", s, "GET", "", true);
}