private java.util.Collection filterByAdjacentAndVisitArea(java.util.Collection collection) {
    java.util.Set<com.example.nickozoulis.teamproj.domain.Referee> refs = ((java.util.HashSet<com.example.nickozoulis.teamproj.domain.Referee>) (collection));
    java.util.Set<com.example.nickozoulis.teamproj.domain.Referee> filteredCollection = new java.util.HashSet<>();
    for (com.example.nickozoulis.teamproj.domain.Referee r : refs) {
        if (com.example.nickozoulis.teamproj.domain.Locality.isAreaAdjacent(r.getLocality().getHome(), area)) {
            if (r.getLocality().getVisit().contains(area)) {
                filteredCollection.add(r);
            }
        }
    }
    return filteredCollection;
}