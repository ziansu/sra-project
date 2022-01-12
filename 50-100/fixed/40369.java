public void reorder(int sourceIndex, int destinationIndex) throws java.lang.IndexOutOfBoundsException {
    if ((!(hasIndex(sourceIndex))) || (destinationIndex > (size()))) {
        throw new java.lang.IndexOutOfBoundsException("Invalid index");
    }
    int afterRemoveDestinationIndex = destinationIndex;
    if (sourceIndex < destinationIndex) {
        afterRemoveDestinationIndex--;
    }
    com.bx5a.minstrel.player.Playable playable = list.get(sourceIndex);
    list.remove(sourceIndex);
    list.add(afterRemoveDestinationIndex, playable);
    eventListener.onChanged();
}