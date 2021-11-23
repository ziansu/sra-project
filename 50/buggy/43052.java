public void drawTemporarySprite(structure.TemporarySprite2dDef inTempSprite) {
    structure.TemporarySprite2dDef temporarySprite2dDef = tempSpritesMemoryPool.fetchMemory();
    temporarySprite2dDef.copy(inTempSprite);
    tempSprites.add(temporarySprite2dDef);
}