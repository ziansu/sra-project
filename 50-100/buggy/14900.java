public org.mafagafogigante.dungeon.date.Date generateDateOfBirth() {
    org.mafagafogigante.dungeon.date.Date minimumDate = today.minus(((age) + 1), DungeonTimeUnit.YEAR).plus(1, DungeonTimeUnit.SECOND);
    int secondsInYear = org.mafagafogigante.dungeon.util.DungeonMath.safeCastLongToInteger(DungeonTimeUnit.YEAR.as(DungeonTimeUnit.SECOND));
    return minimumDate.plus(org.mafagafogigante.dungeon.game.Random.nextInteger(secondsInYear), DungeonTimeUnit.SECOND);
}