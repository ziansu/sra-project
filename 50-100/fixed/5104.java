@java.lang.Override
public java.awt.Point nextPoint() {
    int randomWidth = ((int) ((java.lang.Math.random()) * (this.width)));
    int randomHeight = ((int) ((java.lang.Math.random()) * (this.height)));
    return new java.awt.Point(randomWidth, randomHeight);
}