public void actEffects(float delta) {
    for (int i = 0; i < (effects.size()); i++) {
        effects.get(i).act(delta);
    }
}