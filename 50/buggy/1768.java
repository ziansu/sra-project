private int getDepth() {
    int depth = 0;
    for (uk.ac.cam.teamdelta.robert.Cache i = this; i != null; i = i.parent , ++depth) {
    }
    return depth;
}