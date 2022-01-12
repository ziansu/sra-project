public void addEntities(com.badlogic.gdx.utils.IntArray entities) {
    checkModification();
    if ((entities.size) > 0) {
        int[] items = entities.items;
        for (int i = 0, n = items.length; i < n; i++)
            content.entities.set(items[i]);
        
        for (com.github.antag99.retinazer.EntitySetListener listener : content.listeners) {
            listener.inserted(entities);
        }
    }
}