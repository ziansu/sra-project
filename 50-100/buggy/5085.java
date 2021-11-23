public void endOfTick() {
    this.entities.removeAll(entitiesDestroyedInTick);
    entitiesDestroyedInTick.clear();
    this.entities.addAll(entitiesAddedInTick);
    for (me.hii488.objects.entities.BaseEntity ge : entitiesAddedInTick) {
        ge.containerIdentifier = this.identifier;
        ge.onLoad();
    }
    entitiesAddedInTick.clear();
}