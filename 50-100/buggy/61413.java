public void draw(java.awt.Graphics arg0) {
    java.lang.System.out.println("Draw a circle");
    arg0.drawOval(java.lang.Math.min(x, x2), java.lang.Math.min(y, y2), ((java.lang.Math.max(x, x2)) - (java.lang.Math.min(x, x2))), ((java.lang.Math.max(y, y2)) - (java.lang.Math.min(y, y2))));
    arg0.setColor(figureColor);
}