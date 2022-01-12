void flipOrientation() {
    org.sbolstandard.core2.OrientationType orientation = seqAnn.getLocations().iterator().next().getOrientation();
    for (org.sbolstandard.core2.Location loc : seqAnn.getLocations()) {
        loc.setOrientation((orientation == (org.sbolstandard.core2.OrientationType.INLINE) ? org.sbolstandard.core2.OrientationType.REVERSECOMPLEMENT : org.sbolstandard.core2.OrientationType.INLINE));
    }
}