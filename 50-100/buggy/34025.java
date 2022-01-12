public java.lang.Double distanceTo(iad.Point other) {
    java.lang.Double dist = 0.0;
    for (int i = 0; (i < (this.val.size())) && (1 < (other.val.size())); i++) {
        final java.lang.Double d = (other.val.get(i)) - (this.val.get(i));
        dist += d * d;
    }
    return java.lang.Math.sqrt(dist);
}