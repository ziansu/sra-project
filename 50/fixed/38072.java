private org.n52.io.measurement.img.ChartIoHandler configureRenderer(org.n52.io.measurement.img.ChartIoHandler renderer) {
    renderer.setMimeType(org.n52.io.MimeType.IMAGE_PNG);
    renderer.setShowTooltips(false);
    return renderer;
}