public void onEachIteration(org.group17.Map.GameMap gmMap, double dTimePerFrame) {
    for (org.group17.Units.Entity eE : gmMap.getEntityList()) {
        if (eE.getClass().equals(org.group17.Units.Enemy.class)) {
            if (!(((org.group17.Units.Enemy) (eE)).getInBubble())) {
                eE.move(dTimePerFrame);
            }else {
                eE.getSpeed().setX(0);
            }
        }else {
            eE.move(dTimePerFrame);
        }
    }
}