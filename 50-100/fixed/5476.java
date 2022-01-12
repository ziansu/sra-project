private void removeOldBinding(final isogame.engine.KeyBinding b0, final isogame.engine.KeyBinding b1, final javafx.scene.input.KeyCodeCombination k) {
    if ((b0 != null) && (b0 != b1)) {
        if (k.equals(primaryKeys.get(b0)))
            primaryKeys.remove(b0);
        
        if (k.equals(secondaryKeys.get(b0)))
            secondaryKeys.remove(b0);
        
    }
}