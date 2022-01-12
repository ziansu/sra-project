public java.util.LinkedHashMap<java.lang.String, java.util.List<org.neuroml.model.Segment>> getSegmentGroupsVsSegs() throws org.neuroml.model.util.NeuroMLException {
    java.util.LinkedHashMap<java.lang.String, java.util.List<org.neuroml.model.Segment>> sgVsSegId = new java.util.LinkedHashMap<java.lang.String, java.util.List<org.neuroml.model.Segment>>();
    java.util.LinkedHashMap<java.lang.String, org.neuroml.model.SegmentGroup> namesVsSegmentGroups = getNamesVsSegmentGroups();
    for (org.neuroml.model.SegmentGroup sg : cell.getMorphology().getSegmentGroup()) {
        java.util.List<org.neuroml.model.Segment> segsHere = getSegmentsInGroup(namesVsSegmentGroups, sg);
        sgVsSegId.put(sg.getId(), segsHere);
    }
    return sgVsSegId;
}