public boolean equals(thewaypointers.trafficsimulator.common.RoadDTO other) {
    return ((isConnectedTo(other.getFrom())) && (isConnectedTo(other.getTo()))) && ((getLength()) == (other.getLength()));
}