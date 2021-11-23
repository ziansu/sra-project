public static synchronized void removeShape(io.github.simcards.simcards.client.graphics.Shape shape) {
    io.github.simcards.simcards.client.graphics.GLRenderer.shapes.remove(shape);
    io.github.simcards.simcards.client.graphics.GLSurfaceViewWrapper.rerender();
}