@java.lang.Override
public void draw() {
    deltaTime = ((int) ((millis()) - (lastTime)));
    image(background, 0, 0);
    for (ua.naiksoftware.animandfractal.shapes.Wave wave : waves)
        wave.display(deltaTime);
    
    for (ua.naiksoftware.animandfractal.shapes.Star star : stars)
        star.display(deltaTime);
    
    for (ua.naiksoftware.animandfractal.shapes.Fish fish : fishs)
        fish.display(deltaTime);
    
    sun.display();
    text(frameRate, 5, 40);
    lastTime = millis();
}