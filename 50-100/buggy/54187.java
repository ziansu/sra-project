public void falling() {
    if ((this.getStateDefault()) == 2)
        this.stopDoingDefault();
    
    setCurrentSpeed(3.0);
    java.util.Vector pos = getPosition();
    setPosition(new java.util.Vector(pos.getCubeCenterCoordinates().X(), pos.getCubeCenterCoordinates().Y(), pos.Z()));
    this.fallingLevel = getPosition().cubeZ();
    setCurrentActivity(Activity.FALLING);
}