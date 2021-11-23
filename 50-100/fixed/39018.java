@java.lang.Override
public void callback(java.util.ArrayList<com.woww.woww.Restaurant> r) {
    if (r != null) {
        java.util.Collections.sort(r, new java.util.Comparator<com.woww.woww.Restaurant>() {
            @java.lang.Override
            public int compare(com.woww.woww.Restaurant lhs, com.woww.woww.Restaurant rhs) {
                return lhs.getName().compareTo(rhs.getName());
            }
        });
        listSearchResults(r);
        restaurants = r;
    }
}