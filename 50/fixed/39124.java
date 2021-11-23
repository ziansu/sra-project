public void removeChild(de.tahigames.demondefense.engine.Entity child) {
    entities.remove(child);
    child.onRemoveFromCore(core);
}