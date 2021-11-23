@java.lang.Override
public void setBounds(float x, float y, float width, float height) {
    boundingBox.setVertices(new float[]{ x , y , x + width , y , x , y + height , x + width , y + height });
    setWidth(width);
    setHeight(height);
    boundingBox.setPosition(x, y);
}