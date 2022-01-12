public void onEachIteration(org.group17.Map.GameMap gmMap, double dTimePerFrame) {
    for (org.group17.Units.Entity eE : gmMap.getEntityList()) {
        if (eE instanceof org.group17.Units.Enemy) {
            if (((org.group17.Units.Enemy) (eE)).getInBubble()) {
                eE.getSpeed().setX(0);
                java.lang.System.out.println(eE.getSpeed());
            }
        }
        eE.move(dTimePerFrame);
    }
}