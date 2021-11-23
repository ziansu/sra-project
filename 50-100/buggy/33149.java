public void contextCreated(int width, int height) {
    hasCalledCreated = true;
    contextCreated = true;
    this.width = width;
    this.height = height;
    inputProcessor.setPointerTransform((((float) (1)) / width), (((float) (1)) / height), (-0.5F), (-0.5F));
}