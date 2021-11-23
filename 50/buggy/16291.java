public void update(float camX, float camY) {
    locationx = camX;
    locationy = (camY + (SCR_height)) - (height);
}