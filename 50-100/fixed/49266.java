@java.lang.Override
public java.util.List<javelin.model.unit.Combatant> getmonsters(int teamel) {
    java.util.ArrayList<javelin.model.unit.Combatant> clones = new java.util.ArrayList<javelin.model.unit.Combatant>(place.garrison);
    for (int i = 0; i < (clones.size()); i++) {
        clones.set(i, clones.get(i).clonedeeply());
    }
    return clones;
}