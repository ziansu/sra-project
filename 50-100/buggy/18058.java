@java.lang.Override
public void initRoadUser(com.github.rinde.rinsim.core.model.road.RoadModel model) {
    roadModel = com.google.common.base.Optional.of(((com.github.rinde.rinsim.core.model.road.CollisionGraphRoadModel) (model)));
    com.github.rinde.rinsim.geom.Point p;
    while (roadModel.get().isOccupied((p = model.getRandomPosition(rng)))) {
    } 
    roadModel.get().addObjectAt(this, p);
}