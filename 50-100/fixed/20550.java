void draw() {
    if (hovering)
        fill(24);
    else
        noFill();
    
    stroke(255);
    rect(x, y, width, height);
    fill(255);
    noStroke();
    text(text, ((x) + (padding)), (((y) + (height)) - (((height) - (fontSize)) / 2)));
}