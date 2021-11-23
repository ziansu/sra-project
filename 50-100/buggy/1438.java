public com.dotmarketing.portlets.structure.model.Structure getStructureByVelocityVarName(java.lang.String variableName) {
    com.dotcms.contenttype.model.type.ContentType type = super.byVarOrInode(variableName);
    if (type == null) {
        try {
            type = com.dotmarketing.business.FactoryLocator.getContentTypeFactory2().find(variableName);
            return new com.dotcms.contenttype.transform.contenttype.StructureTransformer(type).asStructure();
        } catch (java.lang.Exception e) {
            com.dotmarketing.util.Logger.warn(this.getClass(), (("Structure with var: '" + variableName) + "' not found in db"));
        }
    }
    return new com.dotcms.contenttype.transform.contenttype.StructureTransformer(type).asStructure();
}