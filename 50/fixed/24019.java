@java.lang.Override
public void notifyLeaving(exercise1.Intersection intersection) {
    state = exercise1.Car.CarState.OUTSIDE;
    curIntersection = intersection;
}