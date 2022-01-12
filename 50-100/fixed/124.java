@java.lang.Override
public boolean evaluateImpl(org.alfresco.service.cmr.repository.NodeRef nodeRef) {
    if ((nodeService.hasAspect(nodeRef, org.alfresco.module.org_alfresco_module_rm.capability.declarative.condition.ASPECT_GHOSTED)) && (dispositionService.isDisposableItemCutoff(nodeRef)))
        return true;
    
    return !((dispositionService.isDisposableItemCutoff(nodeRef)) || (recordFolderService.isRecordFolderClosed(nodeRef)));
}