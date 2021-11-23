public int getSlotIndex(java.lang.String slot) {
    final int N = mSlots.size();
    for (int i = 0; i < N; i++) {
        if (slot.equals(mSlots.get(i))) {
            return i;
        }
    }
    mSlots.add(slot);
    mIcons.add(null);
    return N;
}