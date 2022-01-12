public static java.lang.Character loadCharacter(int Id) {
    com.tda367.infinityrun.Utils.LoadCharacter loader = new com.tda367.infinityrun.Utils.LoadCharacter(Id);
    int[] levels = loader.getSaveData();
    java.lang.Character loadedCharacter = new java.lang.Character(levels[0], levels[7], levels[1], levels[3], levels[5], levels[4], levels[6], levels[9], levels[8], levels[2]);
    loadedCharacter.setCharacterID(Id);
    return loadedCharacter;
}