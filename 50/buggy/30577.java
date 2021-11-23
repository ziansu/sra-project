public void setVertexTextColor(int vertexTextColor) {
    this.mVertexTextColor = vertexTextColor;
    mVertexTextPaint.setColor(mVertexTextColor);
    invalidate();
}