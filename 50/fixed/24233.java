public void cycleInstance(controller.commands.CycleDirection direction) {
    currentSelection.updateSelectedCommandable(entities.cycleInstance(direction));
    this.notifyStatusObservers();
}