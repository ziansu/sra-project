@java.lang.Override
public void addObjectAt(com.github.rinde.rinsim.core.model.road.RoadUser obj, com.github.rinde.rinsim.geom.Point pos) {
    if (obj instanceof com.github.rinde.rinsim.core.model.road.MovingRoadUser) {
        com.google.common.base.Preconditions.checkArgument((!(isOccupied(pos))), "Cannot add an object on an occupied position: %s.", pos);
        blockingRegistry.addAt(((com.github.rinde.rinsim.core.model.road.MovingRoadUser) (obj)), pos);
    }
    super.addObjectAt(obj, pos);
}