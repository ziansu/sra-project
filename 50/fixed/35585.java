private void setSlot(model.Point point, model.BufferSlot slot) {
    java.lang.System.out.println(slot);
    this.slots[point.getY()][point.getX()] = slot;
}