public void removeChild(de.tahigames.demondefense.engine.Entity child) {
    if ((entities) == null)
        return ;
    
    entities.remove(child);
    child.onRemoveFromCore(core);
    if (entities.isEmpty())
        entities = null;
    
}