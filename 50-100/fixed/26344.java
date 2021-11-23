public boolean notOnScreen() {
    return ((((((x) + (xmap)) + (spriteSheetWidth)) < 0) || ((((x) + (xmap)) - (spriteSheetWidth)) > (Main.GamePanel.WIDTH))) || ((((y) + (ymap)) + (spriteSheetHeight)) < 0)) || ((((y) + (ymap)) - (spriteSheetHeight)) > (Main.GamePanel.HEIGHT));
}