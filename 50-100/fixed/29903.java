public void drawOut() {
    strokeWeight(2);
    stroke(0);
    fill(fillColor[0], fillColor[1], fillColor[2]);
    rect(xPos, yPos, size, size);
    for (int i = 0; i < (childList.size()); i++) {
        Blocs.Enemy child = childList.get(i);
        child.drawOut();
    }
}