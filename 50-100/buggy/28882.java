public void depart(com.unimelb.swen30006.metromadness.trains.Train t, com.unimelb.swen30006.metromadness.stations.Station preSta, com.unimelb.swen30006.metromadness.tracks.Line l, boolean forward) throws java.lang.Exception {
    if (this.trains.contains(t)) {
        this.trains.remove(t);
        l.depart(preSta, forward);
    }else {
        throw new java.lang.Exception();
    }
}