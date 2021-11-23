public void removeEntityListener(com.badlogic.ashley.core.EntityListener listener) {
    for (com.badlogic.gdx.utils.SnapshotArray<com.badlogic.ashley.core.Engine.EntityListenerData> entityListenerArray : entityListeners.values()) {
        for (int i = 0; i < (entityListenerArray.size); i++) {
            if ((entityListenerArray.get(i).listener) == listener) {
                entityListenerArray.removeIndex(i);
                break;
            }
        }
    }
}