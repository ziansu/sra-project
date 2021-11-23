private void setNextCharacter() {
    characterTurn = ((characterTurn) + 1) % (characterList.size());
}