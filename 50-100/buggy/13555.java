public boolean update() {
    boolean ret = false;
    for (int i = 0; i < (queue.size()); i++) {
        queue.get(i).update();
        if ((queue.get(i).getStatus()) == (AnimationEvent.STATUS_FINISHED)) {
            queue.remove(i);
        }
        ret = true;
    }
    return ret;
}