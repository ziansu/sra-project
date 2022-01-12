private java.awt.Color selectColor() {
    int red = (java.lang.Math.abs(random.nextInt())) % 255;
    int green = (java.lang.Math.abs(random.nextInt())) % 255;
    int blue = (java.lang.Math.abs(random.nextInt())) % 255;
    return new java.awt.Color(red, green, blue);
}