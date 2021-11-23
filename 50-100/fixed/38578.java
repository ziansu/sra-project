protected final void removeTheseConsumptions(final hu.mta.sztaki.lpds.cloud.simulator.iaas.resourcemodel.ResourceConsumption[] conList, final int len) {
    for (int i = 0; i < len; i++) {
        if (!(underRemoval.contains(conList[i]))) {
            underRemoval.add(conList[i]);
        }
        hu.mta.sztaki.lpds.cloud.simulator.util.ArrayHandler.removeAndReplaceWithLast(underAddition, conList[i]);
    }
    if ((mySyncer) != null) {
        mySyncer.nudge();
    }
}