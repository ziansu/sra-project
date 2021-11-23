public void tick(com.gmail.jakekinsella.map.Map map) {
    if ((this.currentRoutine) != null) {
        this.currentRoutine.execute(map);
    }
    if (this.isRoutineFinished()) {
        this.currentRoutine = null;
    }
}