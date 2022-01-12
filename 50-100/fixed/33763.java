private static java.util.LinkedList<de.tuberlin.cit.sdn.middleware.flowSwitching.model.TaskFlowBundle> createTaskFlowBundles(java.util.LinkedList<de.tuberlin.cit.sdn.middleware.flowSwitching.model.Switch> hostSwitches) {
    java.util.LinkedList<de.tuberlin.cit.sdn.middleware.flowSwitching.model.TaskFlowBundle> bundles = new java.util.LinkedList<de.tuberlin.cit.sdn.middleware.flowSwitching.model.TaskFlowBundle>();
    for (de.tuberlin.cit.sdn.middleware.flowSwitching.model.Switch fromSwitch : hostSwitches) {
        for (de.tuberlin.cit.sdn.middleware.flowSwitching.model.Switch toSwitch : hostSwitches) {
            if (!(fromSwitch.getId().equals(toSwitch.getId()))) {
                bundles.add(new de.tuberlin.cit.sdn.middleware.flowSwitching.model.TaskFlowBundle(fromSwitch, toSwitch));
            }
        }
    }
    return bundles;
}