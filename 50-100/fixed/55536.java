public void initialize(org.openpixi.pixi.physics.Simulation s) {
    this.stepInterval = ((int) (java.lang.Math.round(((timeInterval) / (s.getTimeStep())))));
    if (computeEnergyDensity) {
        energyDensityComputation.initialize(s.grid, direction);
    }
    if (computePoyntingVector) {
        poyntingComputation.initialize(s.grid, direction);
    }
    org.openpixi.pixi.diagnostics.FileFunctions.clearFile(("output/" + (path)));
}