@java.lang.Override
public boolean build(controller.map.TableElement t) {
    if ((((t.getBuilding()) == null) && (t.isBuildPossible(this))) && (t.getClass().equals(controller.map.Edge.class))) {
        t.setBuilding(this);
    }
    return false;
}