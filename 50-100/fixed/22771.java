public java.util.ArrayList<engine.AliveEnemyUnit> getAliveEnemyUnits() {
    java.util.ArrayList<engine.AliveEnemyUnit> listOfAlives = new java.util.ArrayList<>();
    java.util.ArrayList<engine.PhysicalEntity> PEs = this.getPhysicalEntities();
    synchronized(PEs) {
        for (engine.PhysicalEntity a : PEs) {
            if (a instanceof engine.AliveEnemyUnit) {
                listOfAlives.add(((engine.AliveEnemyUnit) (a)));
            }
        }
    }
    return listOfAlives;
}