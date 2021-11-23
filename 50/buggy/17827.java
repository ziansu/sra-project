public void actEffects(float delta) {
    for (com.darkhouse.gdefence.Level.Ability.Debuff d : effects) {
        d.act(delta);
    }
}