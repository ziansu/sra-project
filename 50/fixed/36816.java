protected void loadRunConfigsFromSimulation() {
    int index = -1;
    for (org.lemsml.jlems.core.run.RunConfig conf : simulation.getRunConfigs()) {
        runConfigs.put((index++), conf);
    }
}