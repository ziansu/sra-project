private static pedca.context.Context getBottleneckContext(float sizeX, float sizeY, float bottleneckWidth, float bottleneckHeight, float bottleneckPosY) {
    pedca.environment.grid.EnvironmentGrid environmentGrid = new pedca.environment.grid.EnvironmentGrid(((int) (sizeY / (matsimconnector.utility.Constants.CA_CELL_SIDE))), ((int) (sizeX / (matsimconnector.utility.Constants.CA_CELL_SIDE))));
    scenarios.EnvironmentGenerator.initBottleneckScenario(environmentGrid, bottleneckWidth, bottleneckHeight, bottleneckPosY);
    pedca.environment.markers.MarkerConfiguration markerConfiguration = scenarios.EnvironmentGenerator.generateBorderDestinations(environmentGrid);
    return new pedca.context.Context(environmentGrid, markerConfiguration);
}