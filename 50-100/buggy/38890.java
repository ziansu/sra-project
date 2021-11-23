private java.util.List<org.geppetto.model.variables.Variable> getVisualObjectsForGroup(org.neuroml.model.SegmentGroup sg, java.util.List<org.geppetto.model.variables.Variable> allSegments) {
    java.util.List<org.geppetto.model.variables.Variable> geometries = new java.util.ArrayList<org.geppetto.model.variables.Variable>();
    for (org.neuroml.model.Segment segment : segmentGroupSegMap.get(sg)) {
        for (org.geppetto.model.variables.Variable g : allSegments) {
            if (g.getId().equals(org.geppetto.model.neuroml.modelInterpreterUtils.NeuroMLModelInterpreterUtils.getVisualObjectIdentifier(segment))) {
                geometries.add(g);
            }
        }
    }
    return geometries;
}