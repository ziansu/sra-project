@java.lang.Override
public org.xwiki.resource.temporary.TemporaryResourceReference rasterizeToTemporaryResource(java.lang.String content, int width, int height, org.xwiki.model.reference.DocumentReference targetContext) throws java.io.IOException {
    java.io.File out = getContextTempFile(content.hashCode(), targetContext);
    if (rasterizeToFile(content, out, width, height)) {
        return new org.xwiki.resource.temporary.TemporaryResourceReference(org.xwiki.platform.svg.internal.BatikSVGRasterizer.TEMP_DIR_NAME, out.getName(), targetContext);
    }
    return null;
}