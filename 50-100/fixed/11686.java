public void init() {
    onCreateChildAssociation = new org.alfresco.repo.policy.JavaBehaviour(this, "onCreateChildAssociation", Behaviour.NotificationFrequency.TRANSACTION_COMMIT);
    beforeCopyDocumentFolder = new org.alfresco.repo.policy.JavaBehaviour(this, "beforeCopy");
    afterCopyDocumentFolder = new org.alfresco.repo.policy.JavaBehaviour(this, "onCopyComplete", Behaviour.NotificationFrequency.TRANSACTION_COMMIT);
    this.policyComponent.bindAssociationBehaviour(OnCreateChildAssociationPolicy.QNAME, OpenESDHModel.TYPE_DOC_SIMPLE, ContentModel.ASSOC_CONTAINS, this.onCreateChildAssociation);
    this.policyComponent.bindClassBehaviour(BeforeCopyPolicy.QNAME, OpenESDHModel.TYPE_DOC_SIMPLE, this.beforeCopyDocumentFolder);
    this.policyComponent.bindClassBehaviour(OnCopyCompletePolicy.QNAME, OpenESDHModel.TYPE_DOC_SIMPLE, this.afterCopyDocumentFolder);
}