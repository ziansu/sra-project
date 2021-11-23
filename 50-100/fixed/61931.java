public static void artificialFailure(java.lang.String failure) {
    if (((com.emc.sa.service.vipr.ViPRService.artificialFailure) != null) && (com.emc.sa.service.vipr.ViPRService.artificialFailure.equals(failure))) {
        com.emc.sa.service.vipr.ViPRService.log(("Injecting catalog failure: " + failure));
        com.emc.sa.engine.ExecutionUtils.fail("failTask.ArtificialFailure", com.emc.sa.service.vipr.ViPRService.artificialFailure, com.emc.sa.service.vipr.ViPRService.artificialFailure);
    }
}