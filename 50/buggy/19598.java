@java.lang.Override
public tracer.paths.Path clone() {
    java.util.ArrayList<tracer.Point> pts = new java.util.ArrayList<tracer.Point>();
    for (tracer.Point pt : pts) {
        pts.add(new tracer.Point(pt));
    }
    return new tracer.paths.Shape(pts);
}