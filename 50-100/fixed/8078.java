public static org.jocean.http.Feature[] union(final org.jocean.http.Feature[] features1, final org.jocean.http.Feature... features2) {
    final java.util.List<org.jocean.http.Feature> unioned = new java.util.ArrayList<>((null != features1 ? java.util.Arrays.asList(features1) : java.util.Collections.<org.jocean.http.Feature>emptyList()));
    if (null != features2) {
        for (org.jocean.http.Feature toadd : features2) {
            if (!(unioned.contains(toadd))) {
                unioned.add(toadd);
            }
        }
    }
    return unioned.toArray(org.jocean.http.Feature.EMPTY_FEATURES);
}