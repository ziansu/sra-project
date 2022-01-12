public void move(com.apps.philipps.source.helper.Vector destination) {
    this.destination = destination;
    active = ((speed) != 0) && ((destination.compareTo(position)) != 0);
}