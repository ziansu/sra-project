void flipOrientation() {
    org.sbolstandard.core2.OrientationType Orientation = seqAnn.getLocations().iterator().next().getOrientation();
    seqAnn.getLocations().iterator().next().setOrientation((Orientation == (org.sbolstandard.core2.OrientationType.REVERSECOMPLEMENT) ? org.sbolstandard.core2.OrientationType.INLINE : org.sbolstandard.core2.OrientationType.REVERSECOMPLEMENT));
}