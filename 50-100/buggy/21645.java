private org.ahocorasick.trie.State getState(org.ahocorasick.trie.State currentState, java.lang.Character character) {
    org.ahocorasick.trie.State newCurrentState = currentState.nextState(character);
    while (newCurrentState == null) {
        currentState = currentState.failure();
        newCurrentState = currentState.nextState(character);
    } 
    return newCurrentState;
}