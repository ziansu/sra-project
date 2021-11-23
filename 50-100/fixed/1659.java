public franks.game.entity.Entity buildEntity(franks.game.entity.EntityList entities, franks.game.Army army, franks.game.entity.EntityGroupData.EntityInstanceData ref) {
    franks.game.entity.EntityData data = loadEntity(("assets/entities/" + (ref.dataFile)));
    franks.game.entity.Entity dataEnt = entities.buildEntity(this, army, data);
    dataEnt.moveToRegion(ref.x, ref.y);
    if ((ref.direction) != null) {
        dataEnt.setCurrentDirection(ref.direction);
        dataEnt.setDesiredDirection(ref.direction);
    }
    return dataEnt;
}