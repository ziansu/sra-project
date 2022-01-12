private double getBoundedSlope(double slope) {
    if (slope > (org.cowboycoders.turbotrainers.bushido.headunit.BushidoTargetSlopeModel.SLOPE_MAX)) {
        return org.cowboycoders.turbotrainers.bushido.headunit.BushidoTargetSlopeModel.SLOPE_MAX;
    }
    if (slope < (org.cowboycoders.turbotrainers.bushido.headunit.BushidoTargetSlopeModel.SLOPE_MIN)) {
        return org.cowboycoders.turbotrainers.bushido.headunit.BushidoTargetSlopeModel.SLOPE_MIN;
    }
    return slope;
}