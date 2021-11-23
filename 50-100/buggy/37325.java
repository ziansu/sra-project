protected void setDocumentNumber(org.alfresco.service.cmr.repository.NodeRef nodeRef, boolean forceNewNumber) {
    org.alfresco.service.namespace.QName nodeType = nodeService.getType(nodeRef);
    if (dictionaryService.isSubClass(nodeType, AkDmModel.TYPE_AKDM_DOCUMENT)) {
        behaviourFilter.disableBehaviour(nodeRef);
        documentNumberUtil.setDocumentNumber(nodeRef, true);
        behaviourFilter.enableBehaviour(nodeRef);
    }
}