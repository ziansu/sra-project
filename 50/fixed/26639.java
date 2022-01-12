private void endTurn() {
    if ((characterTurn) == ((characterList.size()) - 1)) {
        characterTurn = 0;
    }else {
        characterTurn = (characterTurn) + 1;
    }
}