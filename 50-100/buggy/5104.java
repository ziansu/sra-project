@java.lang.Override
public java.awt.Point nextPoint() {
    int randomWidth = ((int) ((java.lang.Math.random()) * ((this.width) - 1)));
    int randomHeight = ((int) ((java.lang.Math.random()) * ((this.height) - 1)));
    return new java.awt.Point(randomWidth, randomHeight);
}