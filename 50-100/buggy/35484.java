public boolean colorsOfNodeAreRelated(org.aksw.sessa.helper.graph.Node other) {
    java.util.Set<org.aksw.sessa.query.models.NGramEntryPosition> otherColors = other.getColors();
    for (org.aksw.sessa.query.models.NGramEntryPosition color : otherColors) {
        otherColors.addAll(color.getAllDescendants());
    }
    java.util.Set<org.aksw.sessa.query.models.NGramEntryPosition> colors = new java.util.HashSet(this.getColors());
    for (org.aksw.sessa.query.models.NGramEntryPosition color : colors) {
        colors.addAll(color.getAllDescendants());
    }
    otherColors.retainAll(colors);
    return !(otherColors.isEmpty());
}