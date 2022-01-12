public void catsch(java.util.List<java.lang.Character> characters) {
    java.util.List<java.lang.Character> charactersInRadius = getCharactersInRadius(characters);
    java.lang.Character closestCharacter = getClosestCharacter(charactersInRadius);
    if (closestCharacter != null) {
        closestCharacter.beenCaught();
    }
}