public void removeEntities(com.badlogic.gdx.utils.IntArray entities) {
    checkModification();
    int[] items = entities.items;
    for (int i = 0, n = items.length; i < n; i++)
        content.entities.clear(items[i]);
    
    for (com.github.antag99.retinazer.EntitySetListener listener : content.listeners) {
        listener.removed(entities);
    }
}