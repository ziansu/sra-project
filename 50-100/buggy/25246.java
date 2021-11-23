public boolean hasOverlap(ge.edu.freeuni.sdp.arkanoid.model.geometry.Shape other) {
    if (other.getClass().isInstance(ge.edu.freeuni.sdp.arkanoid.model.geometry.Circle.class)) {
        hasOverlap(((ge.edu.freeuni.sdp.arkanoid.model.geometry.Circle) (other)));
    }
    if (other.getClass().isInstance(ge.edu.freeuni.sdp.arkanoid.model.geometry.Rectangle.class)) {
        hasOverlap(((ge.edu.freeuni.sdp.arkanoid.model.geometry.Rectangle) (other)));
    }
    return false;
}