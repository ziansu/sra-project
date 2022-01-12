@java.lang.Override
public void onEnteredStations(im.tny.segvault.s2ls.ILocator locator, im.tny.segvault.subway.Stop... stops) {
    for (im.tny.segvault.subway.Stop stop : stops) {
        current.addVertex(stop);
    }
    if ((getS2LS().getCurrentTrip()) == null) {
        getS2LS().startNewTrip(stops[0]);
    }else {
        getS2LS().getCurrentTrip().setEndVertex(stops[((stops.length) - 1)]);
    }
}