public void doUpdateUI() {
    int size = updates.size();
    for (int i = 0; i < size; i++) {
        if (!(updates.peek().scheduledForDrop)) {
            updates.add(0, updates.peek());
            updates.pop().update();
        }
    }
}