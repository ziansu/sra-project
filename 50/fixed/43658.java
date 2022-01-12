public isogame.engine.KeyBinding setPrimaryKey(final isogame.engine.KeyBinding b, final javafx.scene.input.KeyCodeCombination k) {
    final isogame.engine.KeyBinding last = keys.put(k, b);
    removeOldBinding(last, b, k);
    primaryKeys.put(b, k);
    return last;
}