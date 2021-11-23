public boolean isSparkStreamingJoblet() {
    boolean isSparkStreamingJoblet = false;
    if (org.talend.core.GlobalServiceRegister.getDefault().isServiceRegistered(org.talend.core.ui.ISparkStreamingJobletProviderService.class)) {
        org.talend.core.ui.ISparkStreamingJobletProviderService sparkJobletService = ((org.talend.core.ui.ISparkStreamingJobletProviderService) (org.talend.core.GlobalServiceRegister.getDefault().getService(org.talend.core.ui.ISparkStreamingJobletProviderService.class)));
        if (sparkJobletService != null) {
            isSparkStreamingJoblet = sparkJobletService.isSparkStreamingJobletComponent(this);
        }
    }
    return isSparkStreamingJoblet;
}