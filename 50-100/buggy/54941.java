public void draw() {
    rotation += 10 * (delta);
    delta = ((millis()) - (lastFrame)) / 1000.0F;
    runTime += delta;
    lastFrame = millis();
    background(BACKGROUND_COLOR);
    drawDebug();
    drawGridLines();
    drawGutterMask();
    drawSpinner();
    drawPalette();
    drawTime();
    fill(255, 255, 255, 255);
    rect(graphToCanvas(0, 0), 75, 75);
}