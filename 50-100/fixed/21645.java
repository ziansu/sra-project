private org.ahocorasick.trie.State getState(org.ahocorasick.trie.State currentState, java.lang.Character character) {
    org.ahocorasick.trie.State newCurrentState = null;
    if (currentState != null) {
        newCurrentState = currentState.nextState(character);
        while ((newCurrentState == null) && ((currentState.failure()) != null)) {
            currentState = currentState.failure();
            newCurrentState = currentState.nextState(character);
        } 
    }
    return newCurrentState;
}