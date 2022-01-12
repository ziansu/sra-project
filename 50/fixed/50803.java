public com.dbash.models.DungeonPosition getRandomPointForMonsterPlacement() throws com.dbash.models.Map.MapException {
    return getRandomPoint(true, false, false, border, true);
}