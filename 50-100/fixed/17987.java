private void checkPrivateProjectPhase(com.topcoder.management.project.Project projectHeader, com.topcoder.management.project.Project projectPhases) {
    for (com.topcoder.project.service.impl.Phase p : projectPhases.getAllPhases()) {
        if ((p.getPhaseType().getId()) == (PhaseType.REGISTRATION_PHASE.getId())) {
            if (((projectHeader.getProperty(ProjectPropertyType.PRIVATE_PROJECT)) != null) && (projectHeader.getProperty(ProjectPropertyType.PRIVATE_PROJECT).equals("1"))) {
                p.setPhaseStatus(PhaseStatus.CLOSED);
            }else {
                p.setPhaseStatus(PhaseStatus.SCHEDULED);
            }
            break;
        }
    }
}