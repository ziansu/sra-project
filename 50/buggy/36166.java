public engine.ValidationState start() {
    callWave();
    throw new sun.reflect.generics.reflectiveObjects.NotImplementedException();
    for (engine.PhysicalEntity pe : physicalEntities) {
        timer.schedule(pe.getTimerTask(), 0, pe.getInterval());
    }
    return ValidationState.VALID;
}