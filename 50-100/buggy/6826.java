void gameSetup() {
    twosnakes.Vector headPos = new twosnakes.Vector(100, 100);
    twosnakes.Vector facing = new twosnakes.Vector(1, 0);
    Vector = $missing$;
    size(50, 20);
    state.snake1 = new twosnakes.P1Snake(headPos, facing, null, null, null);
}