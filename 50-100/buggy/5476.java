private void removeOldBinding(final isogame.engine.KeyBinding b0, final isogame.engine.KeyBinding b1, final javafx.scene.input.KeyCodeCombination k) {
    if ((b0 != null) && (b0 != b1)) {
        if ((primaryKeys.get(b0)) == k)
            primaryKeys.remove(b0);
        
        if ((secondaryKeys.get(b0)) == k)
            secondaryKeys.remove(b0);
        
    }
}