public <T> void clearShadow(long taskId, boolean mode) {
    if (mode == (space.SpaceImpl.MODE_SPACE)) {
        synchronized(this.shadow) {
            this.shadow.remove(taskId);
        }
    }
}