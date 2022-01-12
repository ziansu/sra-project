public boolean enoughSpaceForVM(eu.ascetic.paas.self.adaptation.manager.rules.datatypes.Response response, java.lang.String vmOvfType, int vmCount) {
    es.bsc.vmmclient.models.VmRequirements requirements = eu.ascetic.paas.self.adaptation.manager.ovf.OVFUtils.getVMRequirementsFromOvfType(response.getCause().getOvf(), vmOvfType);
    if (requirements == null) {
        return true;
    }
    java.util.List<es.bsc.vmmclient.models.Slot> slots = actuator.getSlots(requirements);
    if ((slots.size()) >= vmCount) {
        return false;
    }
    return true;
}