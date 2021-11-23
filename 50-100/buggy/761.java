public static ogame.utility.Resource[] convertCosts(long[] costs) {
    ogame.utility.Resource[] resources = new ogame.utility.Resource[(costs.length) / 3];
    for (int i = 0; i < 3; i += 3) {
        resources[(i / 3)] = new ogame.utility.Resource(costs[i], costs[(i + 1)], costs[(i + 2)]);
    }
    return resources;
}