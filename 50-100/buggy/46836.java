@java.lang.Override
protected void advanceMove(double dt) {
    java.util.Vector cpos = unit.getPosition().getCubeCoordinates();
    if (!(path.hasNext())) {
        requestFinish();
    }else {
        controller.requestNewActivity(new hillbillies.activities.AdjacentMove(unit, path.getNext().difference(cpos)));
    }
}