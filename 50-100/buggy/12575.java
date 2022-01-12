public void remove(small.data.structures.Vec2 gridPos) {
    int idx = ((gridPos.y) * (gridRows)) + (gridPos.x);
    if (!(map.containsKey(idx))) {
        log.info("Could not remove. Key is not in buffer.");
        return ;
    }
    if (gridPos.equals(relativeOrigin)) {
        log.info("Removing current relative origin requires the relative origin to be updated.");
        log.info("Updating relative origin...");
        this.updateRelativeOrigin();
    }
    map.remove(idx);
}