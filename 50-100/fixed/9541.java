public double getTravelTimeAfter(final double time) {
    final int bs = departures.binarySearch(time);
    final int index = (bs < 0) ? (-bs) - 1 : bs;
    final double tt = (arrivals.get(index)) - (departures.get(index));
    assert tt >= 0;
    return tt;
}