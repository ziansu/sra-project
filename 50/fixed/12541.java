public void putPinholes(final java.util.Map<java.lang.Integer, java.lang.Double> pins) {
    put("sensor s_params pinholeradius", merge(pins.values()));
}