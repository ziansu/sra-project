public MaterialService.PreviewResult previewTexture(spix.app.material.Texture texture) {
    texPreviewMaterial.setTexture("Texture", texture);
    spix.app.material.MaterialService.PreviewResult res = requestPreview(texPreviewMaterial, "Default", spix.app.material.MaterialAppState.DisplayType.FullScreenQuad, 0, null);
    res.originalWidth = texture.getImage().getWidth();
    res.originalHeight = texture.getImage().getHeight();
    return res;
}