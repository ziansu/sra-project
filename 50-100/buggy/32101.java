void flipOrientation() {
    org.sbolstandard.core2.OrientationType Orientation = seqAnn.getLocations().iterator().next().getOrientation();
    try {
        seqAnn.getLocations().iterator().next().setOrientation((Orientation == (org.sbolstandard.core2.OrientationType.REVERSECOMPLEMENT) ? org.sbolstandard.core2.OrientationType.INLINE : org.sbolstandard.core2.OrientationType.REVERSECOMPLEMENT));
    } catch (org.sbolstandard.core2.SBOLValidationException e) {
        e.printStackTrace();
    }
}