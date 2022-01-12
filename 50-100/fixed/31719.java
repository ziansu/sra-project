public void spiralReverse() {
    noStroke();
    fill(((random(255)) + (changeColor)), changeColor, 0);
    translate(((width) / 2), ((height) / 2));
    rotate((-(r)));
    ellipse(position, position, 10, 10);
    (position)++;
    (r)++;
    (changeColor)++;
}