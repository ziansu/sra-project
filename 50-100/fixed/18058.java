@java.lang.Override
public void initRoadUser(com.github.rinde.rinsim.core.model.road.RoadModel model) {
    roadModel = com.google.common.base.Optional.of(((com.github.rinde.rinsim.core.model.road.CollisionGraphRoadModel) (model)));
    com.github.rinde.rinsim.geom.Point p;
    do {
        p = model.getRandomPosition(rng);
    } while (roadModel.get().isOccupied(p) );
    roadModel.get().addObjectAt(this, p);
}