public void draw() {
    if ((mStoredIndexCount) > 0) {
        draw(0, mStoredIndexCount);
    }else {
        draw(0, mStoredPrimitiveCount);
    }
}