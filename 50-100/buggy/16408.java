private void updateVariableVectors() {
    if (burnerOn) {
        lift.accelerate();
    }else {
        lift.decelerate();
    }
    if ((windBlowing) && (!(windResistence.isChangingDirection()))) {
        wind.accelerate();
    }else {
        wind.decelerate();
    }
    windResistence.updateVariableVectors();
}