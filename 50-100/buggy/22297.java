private void erasePrevFrame() {
    noStroke();
    fill(30, 35, 40);
    rect(0, 0, ((width) / 2), ((height) - 200));
    rect(0, 0, width, ((height) / 2));
    fill(30, 35, 40, 1);
    rect(0, ((height) / 2), width, (((height) / 2) - 200));
}