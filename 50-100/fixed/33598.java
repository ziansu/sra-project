public void draw() {
    for (int p = 0; p < (parts.size()); p++) {
        prototype.Part part = parts.get(p);
        part.draw(false, false);
    }
    for (int p = 0; p < (parts.size()); p++) {
        prototype.Part part = parts.get(p);
        part.drawPivot();
    }
}