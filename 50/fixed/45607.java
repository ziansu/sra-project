protected void setControllerHeading(int heading, de.aw.atcc.aircraft.FlightDirection direction) {
    moveModus = de.aw.atcc.views.PilotView.MoveModus.Controller;
    mAircraft.setTargetHeading(heading, direction);
}