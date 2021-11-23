@java.lang.Override
public void add(org.tripsim.api.model.Lane lane) {
    lane.setLanePosition(lanes.size());
    lanes.add(lane);
    onLaneAdded(lane);
}