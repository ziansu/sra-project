protected void printStatus(java.lang.String status) {
    if ((serviceOrchestrator) != null) {
        this.serviceOrchestrator.printStatus(((serviceParameter.getId()) - 1), status);
    }else {
    }
}