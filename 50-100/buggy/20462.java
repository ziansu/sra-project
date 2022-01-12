void processBoundaries() {
    for (org.openstreetmap.osmosis.core.domain.v0_6.Relation postalBoundary : postalBoundaries) {
        processBoundary(postalBoundary, true);
    }
    for (int i = (administrativeBoundaries.size()) - 1; i >= 0; i--) {
        java.util.List<org.openstreetmap.osmosis.core.domain.v0_6.Relation> administrativeBoundary = administrativeBoundaries.get(i);
        for (org.openstreetmap.osmosis.core.domain.v0_6.Relation relation : administrativeBoundary) {
            processBoundary(relation, false);
        }
    }
}