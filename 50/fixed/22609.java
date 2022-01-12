public static void addShape(io.github.simcards.simcards.client.graphics.Shape shape) {
    synchronized(io.github.simcards.simcards.client.graphics.GLRenderer.shapes) {
        io.github.simcards.simcards.client.graphics.GLRenderer.shapes.add(shape);
    }
    io.github.simcards.simcards.client.graphics.GLSurfaceViewWrapper.rerender();
}