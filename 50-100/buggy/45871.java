private Move standardMove(int start, int finish) {
    if ((ThirtyFiveElementArray.validLocation(finish)) && ((locations[finish]) == ' ')) {
        return new Move(player, start, finish, null, ThirtyFiveElementArray.shouldKing(player, finish));
    }
    return null;
}