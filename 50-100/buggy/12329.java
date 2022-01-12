private void updateVersion(java.lang.Long slbId) {
    try {
        int current = buildInfoService.getCurrentTicket(slbId);
        buildInfoService.updateTicket(slbId, (current + 1));
    } catch (java.lang.Exception e) {
        logger.error("Update Version Fail!", e);
    }
}