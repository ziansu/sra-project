public static void main(java.lang.String[] args) {
    ProcSpawn procSpawn = new ProcSpawn("procSpawnFile.txt");
    DriverMain.initVMTypes("vmTypes.txt");
    GlobalMonitor global = new GlobalMonitor();
    while (!(procSpawn.allFinished())) {
        if ((procSpawn.checkNextArrivalTime()) == 0) {
            java.util.ArrayList<Proc> newProcs = procSpawn.spawnNextSet();
        }
        global.computeNextStep();
    } 
}