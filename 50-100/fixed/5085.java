public void endOfTick() {
    this.entities.addAll(entitiesAddedInTick);
    for (me.hii488.objects.entities.BaseEntity ge : entitiesAddedInTick) {
        ge.containerIdentifier = this.identifier;
        ge.onLoad();
    }
    this.entities.removeAll(entitiesDestroyedInTick);
    entitiesAddedInTick.clear();
    entitiesDestroyedInTick.clear();
}