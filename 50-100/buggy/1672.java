private static double redistributeProduction(double elUsage, double possibleProduction, java.util.List<nz.ac.victoria.swen424.mainTypes.SimulationStatus> prodStatus) throws java.lang.Exception {
    double globalDiff = 0;
    double percentage = (java.lang.Math.abs(elUsage)) / possibleProduction;
    for (nz.ac.victoria.swen424.mainTypes.SimulationStatus simStat : prodStatus) {
        double diff = ((simStat.maxElectricity) - (simStat.currentElectricity)) * percentage;
        globalDiff += diff;
        ((nz.ac.victoria.swen424.mainTypes.ElProducer) (simStat.type)).updateProduction(diff);
    }
    return globalDiff;
}