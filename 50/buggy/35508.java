public void setVertexTextSize(float vertexTextSize) {
    this.mVertexTextSize = vertexTextSize;
    mVertexTextPaint.setTextSize(mVertexTextSize);
    invalidate();
}