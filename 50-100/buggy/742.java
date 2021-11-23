@java.lang.Override
public android.graphics.Path getPath() {
    android.graphics.Path contentPath = contentGroup.getPath();
    path.reset();
    float copies = this.copies.getValue();
    float offset = this.offset.getValue();
    for (int i = ((int) (copies)) - 1; i >= 0; i--) {
        matrix.set(transform.getMatrixForRepeater((i + offset)));
        path.addPath(contentPath, matrix);
    }
    return path;
}