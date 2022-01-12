void gameSetup() {
    twosnakes.Vector headPos = new twosnakes.Vector(100, 100);
    twosnakes.Vector facing = new twosnakes.Vector(1, 0);
    twosnakes.Vector size = new twosnakes.Vector(50, 20);
    state.snake1 = new twosnakes.P1Snake(headPos, facing, size, size, size);
}