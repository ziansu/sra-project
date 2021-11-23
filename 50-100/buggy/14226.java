private void createStone() {
    (countStone)++;
    if ((countStone) == (com.codenjoy.dojo.spacerace.model.Spacerace.NEW_APPEAR_PERIOD)) {
        int x = dice.next(((size) - 2));
        if (x != (-1)) {
            addStone((x + 1));
            countStone = 0;
        }
    }
}