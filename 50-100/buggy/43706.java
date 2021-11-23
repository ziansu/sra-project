public boolean isAtPotentialLayoverSpot(org.onebusaway.nyc.vehicle_tracking.impl.inference.state.BlockState blockState, org.onebusaway.nyc.vehicle_tracking.impl.inference.Observation obs) {
    if (blockState == null) {
        return obs.isAtTerminal();
    }
    if (isAtPotentialTerminal(obs.getRecord(), blockState.getBlockInstance()))
        return true;
    
    org.onebusaway.transit_data_federation.services.blocks.ScheduledBlockLocation blockLocation = blockState.getBlockLocation();
    if (blockLocation == null)
        return false;
    
    return (org.onebusaway.nyc.vehicle_tracking.impl.inference.VehicleStateLibrary.getPotentialLayoverSpot(blockLocation)) != null;
}