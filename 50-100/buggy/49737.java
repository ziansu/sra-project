private void swapRestaurants() throws solver.setting.FailedShuffleException {
    int i = random.nextInt(random.nextInt(restaurants.size()));
    int j = solver.setting.random.RandomGenerator.generateRandomExclusive(restaurants.size(), i);
    model.Restaurant r1 = restaurants.get(i);
    model.Restaurant r2 = restaurants.get(j);
    shuffler.swap(r1, r2);
}