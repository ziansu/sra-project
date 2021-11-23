public java.lang.String processRasterAsync(generator.model.RasterCropRequest payload) throws java.lang.Exception {
    java.lang.String id = uuidFactory.getUUID();
    java.util.concurrent.Future<?> thread = rasterGenerator.run(payload, id);
    threadMap.put(id, thread);
    return id;
}