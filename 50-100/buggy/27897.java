private boolean isOverlaping(timemanager.TimeCell timeCell) {
    return (this.getStart().plusNanos(1).isAfter(timeCell.getEnd())) || (this.getEnd().minusNanos(1).isBefore(timeCell.getStart()));
}