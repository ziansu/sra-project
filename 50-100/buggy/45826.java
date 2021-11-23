@org.springframework.context.annotation.Bean(value = "preProcessWorkflowSteps")
public java.util.Map<java.lang.String, com.dell.cpsd.paqx.dne.service.model.Step> preProcessWorkflowSteps() {
    final java.util.Map<java.lang.String, com.dell.cpsd.paqx.dne.service.model.Step> workflowSteps = new java.util.HashMap<>();
    addWorkflowSteps(workflowSteps, "findAvailableNodes", "listScaleIoComponents", "listVCenterComponents", "discoverScaleIo", "discoverVCenter", "discoverNodeInventory", "configIdrac", "pingIdrac", "configureObmSettings", "configureBootDeviceIdrac", "findScaleIO", "findVCluster", "findProtectionDomain");
    return workflowSteps;
}