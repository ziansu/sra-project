private void skipComment() {
    com.rezzedup.map.Source.Character peek = source.peekNextCharacter();
    while ((((peek.character) != null) && ((peek.character) != '#')) && ((peek.character) != '\n')) {
        source.getNextCharacter();
        peek = source.peekNextCharacter();
    } 
}