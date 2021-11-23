public org.mongodb.morphia.aggregation.GeoNear.GeoNearBuilder setNear(final double latitude, final double longitude) {
    this.near = new double[]{ latitude , longitude };
    return this;
}