private void drawCountDown(org.newdawn.slick.Graphics graphics) {
    if (timers.getCountdownRunning()) {
        graphics.drawString((("Game starts in " + ((timers.getCountdownTimeLeft()) / 1000)) + " seconds"), (((gc.getWidth()) / 2) - 200), (((gc.getHeight()) / 2) - 100));
    }
}