public void setSlotId(short slotId) {
    this.slotPortId = ((slotPortId) & 65535) & (((int) (slotId)) << 16);
}