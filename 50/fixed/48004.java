@java.lang.Override
public java.io.File rasterizeToTemporaryFile(java.lang.String content, int width, int height) throws java.io.IOException {
    java.io.File out = getTempFile(content.hashCode());
    if (rasterizeToFile(content, out, width, height)) {
        return out;
    }
    return null;
}