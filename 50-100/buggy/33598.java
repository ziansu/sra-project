public void draw() {
    for (int p = 0; p < (parts.size()); p++) {
        prototype.Part part = parts.get(p);
        part.draw();
    }
    for (int p = 0; p < (parts.size()); p++) {
        prototype.Part part = parts.get(p);
        part.drawPivot();
    }
}