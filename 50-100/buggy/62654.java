public void mousePressed() {
    resetMatrix();
    fill(0, 150);
    rect(0, 0, width, height);
    position = 0;
    changeColor = 0;
    count = ((int) ((java.lang.Math.random()) * 6)) + 1;
    transparency = 255;
    java.lang.System.out.println(count);
}