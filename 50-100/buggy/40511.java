private void writeGisFiles(edu.mtu.simulation.ForestSim state) throws java.io.IOException {
    if (!(edu.mtu.wup.model.scorecard.WupScorecard.writeGis)) {
        return ;
    }
    sim.field.geo.GeomVectorField parcels = state.getParcelLayer();
    for (edu.mtu.steppables.ParcelAgent agent : state.getParcelAgents()) {
        agent.updateShapefile();
        state.updateAgentGeography(agent);
    }
    java.lang.String fileName = java.lang.String.format(((filesDirectory) + (edu.mtu.wup.model.scorecard.WupScorecard.nipfoFile)), state.schedule.getSteps());
    sim.io.geo.ShapeFileExporter.write(fileName, parcels);
}