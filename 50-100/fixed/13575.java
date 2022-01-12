private boolean cheesePath() {
    Point cheese = mm.getCheese();
    java.util.Queue<java.lang.String> tempPath = null;
    if (cheese != null) {
        tempPath = mm.findPath(position, cheese, false);
    }
    if (tempPath != null) {
        if ((tempPath.peek()) != null) {
            path = tempPath;
            return true;
        }
    }
    return false;
}