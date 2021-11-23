public static org.jocean.http.Feature[] union(final org.jocean.http.Feature[] features1, final org.jocean.http.Feature... features2) {
    final java.util.Set<org.jocean.http.Feature> unioned = new java.util.HashSet<>((null != features1 ? java.util.Arrays.asList(features1) : java.util.Collections.<org.jocean.http.Feature>emptyList()));
    if (null != features2) {
        for (org.jocean.http.Feature toadd : features2) {
            unioned.add(toadd);
        }
    }
    return unioned.toArray(org.jocean.http.Feature.EMPTY_FEATURES);
}