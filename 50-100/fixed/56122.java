public void init(org.csstudio.utility.toolbox.types.DocumentCategory documentCategory, org.csstudio.utility.toolbox.types.ForeignKey foreignKey) {
    org.apache.commons.lang.Validate.notNull(documentCategory, "documentCategory must not be null");
    org.apache.commons.lang.Validate.notEmpty(documentCategory.getValue(), "category value must not be empty");
    org.apache.commons.lang.Validate.notNull(foreignKey, "foreignKey must not be null");
    this.documentCategory = documentCategory;
    this.documents = documentService.find(documentCategory, foreignKey);
    this.trashCan = new java.util.ArrayList<org.csstudio.utility.toolbox.entities.Document>();
    initialized = true;
}