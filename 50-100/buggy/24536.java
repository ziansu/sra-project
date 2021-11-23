public void randomBrush() {
    float speed = (abs(((mouseX) - (pmouseX)))) + (abs(((mouseY) - (pmouseY))));
    stroke(speed);
    fill(random(255), random(255), random(255), opacity);
    ellipse(mouseX, mouseY, speed, speed);
}