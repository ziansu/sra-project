private void startScaling() {
    glPushMatrix();
    cached = false;
    float scale = getScale();
    glScalef(scale, scale, 1);
    glTranslatef((((this.width) - ((this.xSize) * scale)) / (2 * scale)), (((this.height) - ((this.ySize) * scale)) / (2 * scale)), 0.0F);
}