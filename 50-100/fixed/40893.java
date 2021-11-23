private java.util.Collection filterByHomeArea(java.util.Collection collection) {
    java.util.Set<com.example.nickozoulis.teamproj.domain.Referee> refs = ((java.util.HashSet<com.example.nickozoulis.teamproj.domain.Referee>) (collection));
    java.util.Set<com.example.nickozoulis.teamproj.domain.Referee> filteredCollection = new java.util.HashSet<>();
    for (com.example.nickozoulis.teamproj.domain.Referee r : refs) {
        if ((area) == (r.getLocality().getHome())) {
            filteredCollection.add(r);
        }
    }
    return filteredCollection;
}