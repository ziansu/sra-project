public static boolean isDomain(java.lang.String target, java.lang.String[] strings) throws java.net.MalformedURLException {
    java.lang.String domain = new java.net.URL(target).getHost();
    for (java.lang.String s : strings) {
        s = s.toLowerCase().trim();
        if (((!(s.isEmpty())) && (!(s.equals("\n")))) && (domain.equals(s))) {
            return true;
        }
    }
    return false;
}