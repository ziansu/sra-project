public void writeTo(com.emc.vipr.model.catalog.CatalogServiceRestRep service) {
    service.setName(title.replaceAll(" ", ""));
    service.setTitle(title);
    service.setDescription(description);
    service.setImage(image);
    service.setBaseService(baseService);
    service.setApprovalRequired(this.approvalRequired);
    service.setExecutionWindowRequired(this.executionWindowRequired);
    service.setMaxSize(((this.maxSize) != null ? this.maxSize : 0));
}