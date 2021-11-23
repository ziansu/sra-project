private boolean IsAllDistanceZero() {
    int index = 0;
    double zero = 0;
    while ((index != (_radarPacketObservableList.size())) && ((_radarPacketObservableList.get(index).getCurrentDistance()) == zero)) {
        index++;
    } 
    return index > (_radarPacketObservableList.size());
}