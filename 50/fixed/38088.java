public static void removeShape(io.github.simcards.simcards.client.graphics.Shape shape) {
    synchronized(io.github.simcards.simcards.client.graphics.GLRenderer.shapes) {
        io.github.simcards.simcards.client.graphics.GLRenderer.shapes.remove(shape);
    }
    io.github.simcards.simcards.client.graphics.GLSurfaceViewWrapper.rerender();
}