private java.util.Collection filterByAdjacentAndVisitArea(java.util.Collection collection) {
    java.util.ArrayList<com.example.nickozoulis.teamproj.domain.Referee> refs = ((java.util.ArrayList<com.example.nickozoulis.teamproj.domain.Referee>) (collection));
    java.util.ArrayList<com.example.nickozoulis.teamproj.domain.Referee> filteredCollection = new java.util.ArrayList<com.example.nickozoulis.teamproj.domain.Referee>();
    for (com.example.nickozoulis.teamproj.domain.Referee r : refs) {
        if (com.example.nickozoulis.teamproj.domain.Locality.isAreaAdjacent(r.getLocality().getHome(), area)) {
            if (r.getLocality().getVisit().contains(area)) {
                filteredCollection.add(r);
            }
        }
    }
    return filteredCollection;
}