private java.util.Collection filterByHomeArea(java.util.Collection collection) {
    java.util.ArrayList<com.example.nickozoulis.teamproj.domain.Referee> refs = ((java.util.ArrayList<com.example.nickozoulis.teamproj.domain.Referee>) (collection));
    java.util.ArrayList<com.example.nickozoulis.teamproj.domain.Referee> filteredCollection = new java.util.ArrayList<com.example.nickozoulis.teamproj.domain.Referee>();
    for (com.example.nickozoulis.teamproj.domain.Referee r : refs) {
        if ((area) == (r.getLocality().getHome())) {
            filteredCollection.add(r);
        }
    }
    return filteredCollection;
}