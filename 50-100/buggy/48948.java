private void runSimulation(java.util.List<elements.UserEquipment> ues) {
    java.lang.System.out.println("Starting simulation");
    java.util.Timer time = new java.util.Timer();
    utils.UserEquipmentMover st = new utils.UserEquipmentMover(ues);
    time.schedule(st, 0, 1000);
    try {
        java.lang.Thread.sleep(runner.main.Simulator.SIMULATION_TIME);
        time.cancel();
        time.purge();
    } catch (java.lang.InterruptedException e1) {
        e1.printStackTrace();
    }
}