@java.lang.Override
public boolean build(controller.map.TableElement t) {
    if ((t != null) && ((t.getBuilding()) != null))
        if (((t.getBuilding().getClass().equals(controller.player.Settlement.class)) && (t.isBuildPossible(this))) && (t.getClass().equals(controller.map.Vertex.class))) {
            t.setBuilding(this);
        }
    
    return false;
}