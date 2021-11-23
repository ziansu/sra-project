public boolean hasPathTo(programming_assignments.HW2_SeamCarving.seam_carving.SeamCarver.Point destination) {
    return (distTo[destination.getX()][destination.getY()]) != (java.lang.Double.POSITIVE_INFINITY);
}