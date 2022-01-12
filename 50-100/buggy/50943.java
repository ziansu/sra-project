public static ATSSG.Entities.Entity getEntity(int id, ATSSG.Script.Framework.Script environment) {
    for (ATSSG.Entities.Entity e : environment.getOwner().getOwner().getContaining_map().getEntities()) {
        java.lang.System.out.println(((("Comparing " + e) + " to ") + id));
        if ((e.getId()) == id)
            return e;
        
    }
    return null;
}