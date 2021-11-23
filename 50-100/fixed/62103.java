public void addCharacterToRoom(java.lang.Character character, deadlybanquet.model.Direction dir) {
    for (deadlybanquet.model.Door d : doors) {
        if ((d.getDirection()) == (deadlybanquet.model.Direction.getOppositeDirection(dir))) {
            character.setPos(deadlybanquet.model.Position.getAdjacentPositionInDirection(d.getPos(), dir));
            addCharacter(character);
        }
    }
}