public boolean onScreen() {
    return ((((-(width)) <= (x)) && ((x) <= ((Main.GamePanel.WIDTH) + (width)))) && (0 <= ((y) + (cheight)))) && (((y) + (cheight)) < (Main.GamePanel.HEIGHT));
}