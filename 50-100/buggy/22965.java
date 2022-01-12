private double rangeErrorTroposphericModel(final org.orekit.estimation.measurements.GroundStation station, final org.orekit.propagation.SpacecraftState state) throws org.orekit.errors.OrekitException {
    final org.hipparchus.geometry.euclidean.threed.Vector3D position = state.getPVCoordinates().getPosition();
    final double elevation = station.getBaseFrame().getElevation(position, state.getFrame(), state.getDate());
    if (elevation > 0) {
        final double height = getStationHeightAMSL(station);
        final double delay = tropoModel.pathDelay(elevation, height);
        return 2 * delay;
    }
    return 0;
}