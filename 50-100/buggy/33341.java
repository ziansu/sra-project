@java.lang.Override
nz.ac.victoria.swen424.mainTypes.SimulationStatus Simulate(int time) {
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
}