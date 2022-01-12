public static ATSSG.Entities.Entity getEntity(int id, ATSSG.Script.Framework.Script environment) {
    for (ATSSG.Entities.Entity e : environment.getOwner().getOwner().getContaining_map().getEntities()) {
        if ((e.getId()) == id)
            return e;
        
    }
    return null;
}