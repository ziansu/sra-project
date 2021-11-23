protected void localSearch(com.jraska.vsb.or1.schedule.abc.Bee bee) {
    boolean foundBetter = bee.searchForNewPosition();
    if (foundBetter) {
        if ((bee._positionValue) < (_bestValue)) {
            _bestValue = bee._positionValue;
            _bestSolution = bee._position;
        }
    }
}