public void addChild(de.tahigames.demondefense.engine.Entity child) {
    entities.add(child);
    child.onAddToCore(core);
}