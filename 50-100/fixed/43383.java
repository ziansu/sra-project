private void addLane(org.tripsim.api.model.Link link, org.tripsim.data.dom.LaneDo entity) {
    org.tripsim.api.model.Lane lane = factory.createLane(entity.getLaneId(), link, entity.getStart(), entity.getEnd(), entity.getWidth());
    lanes.put(lane.getId(), lane);
}