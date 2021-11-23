public void removeDeadline(int index) {
    deadlines.remove(index);
    deadlines = new java.util.ArrayList<fifo.entity.Deadline>(deadlines);
}