private static void updatePosition() {
    int size = assignment4.Critter.population.size();
    assignment4.Critter.position = new assignment4.Critter[Params.world_height][Params.world_width];
    for (int i = 0; i < size; i++) {
        int x = assignment4.Critter.population.get(i).x_coord;
        int y = assignment4.Critter.population.get(i).y_coord;
        assignment4.Critter.position[y][x] = assignment4.Critter.population.get(i);
    }
}