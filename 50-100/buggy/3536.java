private void setupFilterLimitingResourceListbox() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.setupFilterLimitingResourceListbox" + (getWorker())));
    for (org.libreplan.web.resources.worker.WorkerCRUDController.LimitingResourceEnum resourceEnum : org.libreplan.web.resources.worker.WorkerCRUDController.LimitingResourceEnum.getLimitingResourceFilterOptionList()) {
        org.zkoss.zul.Listitem item = new org.zkoss.zul.Listitem();
        item.setParent(filterLimitingResource);
        item.setValue(resourceEnum);
        item.appendChild(new org.zkoss.zul.Listcell(resourceEnum.toString()));
        filterLimitingResource.appendChild(item);
    }
    filterLimitingResource.setSelectedIndex(0);
}