private void increaseSizes(double timeDiff) {
    synchronized(circlesOnField) {
        for (bouncingballs.GameCircle circle : circlesOnField) {
            if (circle.isSelected()) {
                invalidateEvents(circle);
                circle.increaseRadius(timeDiff);
                predict(circle, 0);
            }
        }
    }
}