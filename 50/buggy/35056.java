public void draw(java.awt.Graphics graph) {
    if (com.aventura.tools.tracing.Tracer.function)
        com.aventura.tools.tracing.Tracer.traceFunction(this.getClass(), "draw Swing View");
    
    ((java.awt.Graphics2D) (graph)).drawImage(frontbuffer, null, null);
}