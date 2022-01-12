private void reset() {
    character = new com.grupptva.runnergame.game.model.gamecharacter.GameCharacter(30, 150, pixelsPerFrame);
    world.setChunks(new com.grupptva.runnergame.game.model.world.Chunk[]{ c , generator.generateChunk() , generator.generateChunk() });
    world.setPosition(0);
    world.setStartIndex(0);
}