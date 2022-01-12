@java.lang.Override
public void run() {
    java.lang.System.out.println(("Start Execution " + (machineExecution.getId())));
    try {
        uniandes.unacloud.agent.execution.domain.ImageCopy image = uniandes.unacloud.agent.execution.ImageCacheManager.getFreeImageCopy(machineExecution, transmissionType);
        machineExecution.setImage(image);
        image.configureAndStart(machineExecution);
        java.lang.System.out.println("endStartExecution");
    } catch (uniandes.unacloud.agent.exceptions.ExecutionException ex) {
        try {
            uniandes.unacloud.agent.net.send.ServerMessageSender.reportExecutionState(machineExecution.getId(), ExecutionProcessEnum.FAIL, ex.getMessage());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}