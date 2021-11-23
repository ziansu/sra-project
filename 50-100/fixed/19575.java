@java.lang.Override
public void setBounds(float x, float y, float width, float height) {
    boundingBox.setVertices(new float[]{ 0 , 0 , width , 0 , 0 , height , width , height });
    setWidth(width);
    setHeight(height);
    setPosition(x, y);
}