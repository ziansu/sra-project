private void updateVariableVectors() {
    if (burnerOn) {
        lift.accelerate();
    }else {
        lift.decelerate();
    }
    if (windBlowing) {
        wind.accelerate();
    }else {
        wind.decelerate();
    }
    windResistence.update();
}