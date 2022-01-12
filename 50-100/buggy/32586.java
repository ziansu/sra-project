@java.lang.Override
public void onMilestoneReceived(com.ericmguimaraes.gaso.evaluation.Milestone milestone) {
    if (fuelDiference >= 0) {
        if (milestone == null)
            milestone = dao.createNewMilestone(0, lastFuelLevel, null);
        
        milestone.setDistanceRolled(((milestone.getDistanceRolled()) + (java.lang.Float.parseFloat(distanceStr))));
        milestone.setCombustiveConsumed(((milestone.getCombustiveConsumed()) + fuelDiference));
        dao.addOrUpdate(milestone);
    }else {
        sendBroadcastRefilled((fuelDiference * (-1)));
    }
}