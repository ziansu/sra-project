public void offer(int integer) {
    this.queue.offer(integer);
    model.fireAddTile(19, integer);
}