void drawTextGraphics(processing.core.PShape s) {
    pushMatrix();
    scale(1.0F);
    translate(0, 0, (-0.25F));
    shape(s);
    popMatrix();
}