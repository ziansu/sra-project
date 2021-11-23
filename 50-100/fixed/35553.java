@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.util.List<com.pokemonbattlearena.android.engine.database.Move> moves = mApplication.getBattleDatabase().getMovesForPokemon(selectedPokemon);
    java.util.Collections.shuffle(moves);
    if ((moves.size()) < 4) {
        selectedPokemon.setActiveMoveList(moves);
    }else {
        selectedPokemon.setActiveMoveList(moves.subList(0, 4));
    }
    selectedTeamArrayList.add(selectedPokemon);
    item.mCheckbox.setChecked(true);
}