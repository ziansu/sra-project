protected void setOrbitalPositionTotal() {
    this.setPosition(((orbitalProperties.calculateOrbitalPositionX(orbitalRadiusInPixels)) - ((getWidth()) / 2)), ((orbitalProperties.calculateOrbitalPositionY(orbitalRadiusInPixels)) - ((getHeight()) / 2)));
}