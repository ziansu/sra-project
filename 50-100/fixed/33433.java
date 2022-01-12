public boolean equals(thewaypointers.trafficsimulator.common.RoadDTO other) {
    return (((other != null) && (isConnectedTo(other.getFrom()))) && (isConnectedTo(other.getTo()))) && ((getLength()) == (other.getLength()));
}