public void runExpeditionCheck() {
    biocode.fims.run.Expedition expedition = project.getExpedition(processController.getExpeditionCode());
    if (expedition == null) {
        processController.setExpeditionCreateRequired(true);
    }else
        if ((java.lang.Boolean.valueOf(biocode.fims.run.Process.sm.retrieveValue("ignoreUser"))) || (expedition.getUser().equals(processController.getUser())))
            processController.setExpeditionAssignedToUserAndExists(true);
        
    
}