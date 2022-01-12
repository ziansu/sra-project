private void setCurrentCommand(android.graphics.Point point) {
    float throttle = ((getCenter().y) - (point.y)) / ((float) (getRadius()));
    float differential = ((getCenter().x) - (point.x)) / ((float) (getRadius()));
    if (throttle >= (theokanning.rover.ui.view.Dpad.MINIMUM_THROTTLE)) {
        currentCommand = new theokanning.rover.ui.model.SteeringCommand(throttle, differential);
    }
}