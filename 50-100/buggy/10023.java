private void effect() {
    for (com.dungeon.game.effect.Effect effect : effects) {
        effect.update(this);
    }
    for (int i = 0; i < (effects.size()); i++) {
        if (effects.get(i).killMe) {
            effects.get(i).end(this);
            effects.remove(i);
            i--;
        }
    }
}