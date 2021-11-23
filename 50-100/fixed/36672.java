protected void setOrbitalPositionTotal() {
    this.setPosition(((orbitalProperties.calculateOrbitalPositionX(orbitalRadiusInPixels, 0)) - ((getWidth()) / 2)), ((orbitalProperties.calculateOrbitalPositionY(orbitalRadiusInPixels, 0)) - ((getHeight()) / 2)));
}