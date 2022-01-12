private void updatePokemonImages(com.pokemonbattlearena.android.engine.match.BattlePokemon self, com.pokemonbattlearena.android.engine.match.BattlePokemon opponent) {
    mPlayerBattleView.setActivePokemon(self.getOriginalPokemon(), getDrawableForPokemon(self.getOriginalPokemon().getName(), com.pokemonbattlearena.android.fragments.battle.BattleHomeFragment.typePokemon));
    mOpponentBattleView.setActivePokemon(opponent.getOriginalPokemon(), getDrawableForPokemon(opponent.getOriginalPokemon().getName(), com.pokemonbattlearena.android.fragments.battle.BattleHomeFragment.typePokemon));
}