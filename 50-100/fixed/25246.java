public boolean hasOverlap(ge.edu.freeuni.sdp.arkanoid.model.geometry.Shape other) {
    if (other instanceof ge.edu.freeuni.sdp.arkanoid.model.geometry.Circle) {
        return hasOverlap(((ge.edu.freeuni.sdp.arkanoid.model.geometry.Circle) (other)));
    }
    if (other instanceof ge.edu.freeuni.sdp.arkanoid.model.geometry.Rectangle) {
        return hasOverlap(((ge.edu.freeuni.sdp.arkanoid.model.geometry.Rectangle) (other)));
    }
    return false;
}