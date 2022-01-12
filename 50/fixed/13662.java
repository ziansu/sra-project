private void createFakeWorkoutsTestData() {
    int weight = 0;
    for (int daysBack = 150; daysBack > 0; daysBack-- , weight += 2) {
        createFakeWorkoutTestData(daysBack, weight);
    }
}