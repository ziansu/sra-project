public int poll() {
    model.fireRemoveTile(17);
    model.fireMoveTile(18, 17);
    model.fireMoveTile(19, 18);
    return this.queue.poll();
}