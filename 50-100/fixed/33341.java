@java.lang.Override
nz.ac.victoria.swen424.mainTypes.SimulationStatus Simulate(int time) throws java.lang.Exception {
    int daytiem = time % 24;
    int day = (time - daytiem) / 24;
    switch (_productionType) {
        case Wind :
            return simulateWind(day);
        case Solar :
            break;
        default :
            break;
    }
    return null;
}