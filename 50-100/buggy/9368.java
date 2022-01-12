private void addSyncObjectPerformed(org.apache.wicket.ajax.AjaxRequestTarget target) {
    com.evolveum.midpoint.web.component.wizard.resource.ObjectSynchronizationType syncObject = new com.evolveum.midpoint.web.component.wizard.resource.ObjectSynchronizationType();
    syncObject.setEnabled(true);
    syncObject.setName(generateName(getString("SynchronizationStep.label.newObjectType")));
    resourceModel.getObject().asObjectable().getSynchronization().getObjectSynchronization().add(syncObject);
    editSyncObjectPerformed(target, syncObject);
    parentPage.refreshIssues(target);
}