public java.lang.String processRasterAsync(generator.model.RasterCropRequest payload) throws java.lang.Exception {
    java.lang.String id = uuidFactory.getUUID();
    rasterGenerator.run(payload, id);
    return id;
}