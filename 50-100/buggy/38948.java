@java.lang.Override
protected void onPause() {
    super.onPause();
    int turnOrder = 0;
    characterList = combatAdapter.getCharacterList();
    for (me.colinhowes.rollinitiative.data.CharacterType character : characterList) {
        character.setTurnOrder(turnOrder);
        me.colinhowes.rollinitiative.data.CharacterDbHelper.updateCharacter(db, character);
        turnOrder++;
    }
}