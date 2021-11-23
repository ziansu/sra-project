public boolean applies(battle.Battle b, pokemon.ActivePokemon user, pokemon.ActivePokemon victim) {
    return (!(victim.fullHealth())) && (!(victim.hasEffect(EffectNamesies.HEAL_BLOCK)));
}