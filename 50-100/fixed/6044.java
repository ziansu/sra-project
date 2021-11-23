@java.lang.Override
protected void addMOChildren() {
    if ((tlObj) != null) {
        for (org.opentravel.schemacompiler.model.TLParamGroup tlp : tlObj.getParamGroups())
            new org.opentravel.schemas.node.resources.ParamGroup(tlp);
        
        for (org.opentravel.schemacompiler.model.TLAction action : tlObj.getActions())
            new org.opentravel.schemas.node.resources.ActionNode(action);
        
        for (org.opentravel.schemacompiler.model.TLActionFacet af : tlObj.getActionFacets())
            new org.opentravel.schemas.node.resources.ActionFacet(af);
        
    }
}