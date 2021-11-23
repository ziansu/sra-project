public void clear() {
    for (de.nerogar.noise.render.deferredRenderer.DeferredRenderer.VboContainer container : vboMap.values()) {
        container.vbo.cleanup();
    }
    vboMap.clear();
    profiler.setValue(DeferredRendererProfiler.OBJECT_COUNT, 0);
    if (de.nerogar.noise.Noise.DEBUG) {
        addObject(originAxis);
    }
}