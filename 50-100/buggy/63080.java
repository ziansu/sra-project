protected final void run(int direction) {
    if (!(hasMoved)) {
        x_coord += (x_directions[direction]) * 2;
        x_coord %= Params.world_width;
        y_coord += (y_directions[direction]) * 2;
        y_coord %= Params.world_height;
    }
    energy -= Params.run_energy_cost;
    hasMoved = true;
}