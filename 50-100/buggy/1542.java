@java.lang.Override
public float getLength() {
    float dist = 0;
    tracer.Point a = vertices2D.get(0);
    for (int i = 1; i < (vertices2D.size()); i++) {
        tracer.Point b = vertices2D.get(i);
        dist += tracer.paths.Line.dist(a, b);
        a = b;
    }
    return dist;
}