public void stopInstances(int amount, java.lang.String tag) throws java.lang.Exception {
    int currentSize = getNumberOfResources(tag);
    java.util.ArrayList<tools.descartes.bungee.cloud.cloudstack.VirtualMachine> vms = getAllVms(tag, tools.descartes.bungee.cloud.cloudstack.CloudStackInteraction.RUNNING);
    if ((vms.size()) > amount) {
        for (int i = 0; i < amount; i++) {
            stopVM(vms.get(i).getId());
        }
    }else {
        throw new java.lang.IllegalArgumentException("Too less Instances");
    }
}