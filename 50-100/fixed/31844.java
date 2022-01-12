public void setParametersInFischParameters(int fieldLength, int fieldHeight, int fishNumber, int threads, int neighbours, int deathAngle, int r1, int r2, int r3, int bodyLength) {
    de.pvr.fish.simulation.config.FishParameter.ITERATIONS = this.iterations;
    de.pvr.fish.simulation.config.FishParameter.THREADS = threads;
    de.pvr.fish.simulation.config.FishParameter.NUMBER_FISH = fishNumber;
    de.pvr.fish.simulation.config.FishParameter.FIELD_LENGTH = fieldLength;
    de.pvr.fish.simulation.config.FishParameter.FIELD_HEIGHT = fieldHeight;
    de.pvr.fish.simulation.config.FishParameter.NUMBER_OF_NEIGHBOURS = neighbours;
    de.pvr.fish.simulation.config.FishParameter.DEATH_ANGLE = deathAngle;
    de.pvr.fish.simulation.config.FishParameter.RADIUS1 = r1;
    de.pvr.fish.simulation.config.FishParameter.RADIUS2 = r2;
    de.pvr.fish.simulation.config.FishParameter.RADIUS3 = r3;
    de.pvr.fish.simulation.config.FishParameter.FISH_BODY_LENGTH = bodyLength;
}