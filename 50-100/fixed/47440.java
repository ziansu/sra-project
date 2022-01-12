protected void drawLine(com.aventura.model.world.Line l) {
    if (com.aventura.tools.tracing.Tracer.function)
        com.aventura.tools.tracing.Tracer.traceFunction(this.getClass(), "drawLine(l)");
    
    if (com.aventura.tools.tracing.Tracer.info)
        com.aventura.tools.tracing.Tracer.traceInfo(this.getClass(), ("Drawing Line. " + l));
    
    drawLine(l.getV1(), l.getV2());
}