public void accelerate(double timedelta) {
    traffic_sim.Vehicle in_front = current_lane.getVehicleInFront(this);
    if (((in_front == null) && ((current_lane.getDistanceToEnd(position)) > 0)) || ((in_front != null) && ((getFrontVehicleDistance(in_front)) >= (2 * (Lane.min_car_distance))))) {
        current_velocity += timedelta * (ACCEL);
        current_velocity = ((current_velocity) > (MAX_VELOCITY)) ? MAX_VELOCITY : current_velocity;
    }
}