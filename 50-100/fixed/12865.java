private boolean deliverLevelParts(com.lappard.android.level.LevelCreator.PartAvailableListener listener) {
    if ((levelParts.size()) > (deliveredParts)) {
        java.util.List<com.badlogic.gdx.scenes.scene2d.Actor> result = createActors(levelParts.get(deliveredParts));
        (deliveredParts)++;
        listener.onPartAvailable(result);
        return true;
    }
    return false;
}