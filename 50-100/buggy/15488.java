public void setClip(java.awt.Shape clip) {
    checkNoCloneActive();
    this.clipShape = (clip == null) ? null : transform.createTransformedShape(clip);
    try {
        contentStream.restoreGraphicsState();
        contentStream.saveGraphicsState();
        if (clip != null) {
            walkShape(clip);
            contentStream.clip();
        }
    } catch (java.io.IOException e) {
        throwIOException(e);
    }
}