public void setSize(float width, float height) {
    this.width = width;
    this.height = height;
    rootComponent.setSize(width, height);
    renderer.setViewportSize(width, height);
}