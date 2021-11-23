public void print_Floor_queue() {
    java.lang.String queue = "";
    for (int i = 0; i < (this.getFloor_queue().length); i++) {
        if ((this.floor_queue[i]) > 0) {
            queue = (queue + i) + " ";
        }
    }
    android.util.Log.i("Queue", (((this.id) + " ") + queue));
}