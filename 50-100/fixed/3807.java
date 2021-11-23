protected final void run(int direction) {
    if (!(assignment4.Critter.timeStep)) {
        moveSteps(2, direction);
    }else {
        int x = x_coord;
        int y = y_coord;
        moveSteps(2, direction);
        if (!(checkCollision(x_coord, y_coord))) {
            x_coord = x;
            y_coord = y;
        }
    }
    energy -= Params.run_energy_cost;
}