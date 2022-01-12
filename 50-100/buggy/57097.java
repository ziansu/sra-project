private void borrowLeafNext() {
    alchemystar.bp.Tuple borrowKey = next.getEntries().get(0);
    next.getEntries().remove(borrowKey);
    entries.add(borrowKey);
    int currEntryIdx = getParentEntry(this.next);
    parent.getEntries().remove(currEntryIdx);
    parent.getEntries().add(currEntryIdx, borrowKey);
}