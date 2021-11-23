@java.lang.Override
public void add(org.tripsim.api.model.Lane lane) {
    if (lanes.contains(lane)) {
        return ;
    }
    lane.setLanePosition(lanes.size());
    lanes.add(lane);
    onLaneAdded(lane);
}