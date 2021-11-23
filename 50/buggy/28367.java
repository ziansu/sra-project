public short getSlotId() {
    return ((short) (((slotPortId) & -65536) >> 16));
}