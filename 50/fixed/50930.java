@java.lang.Override
public org.structr.core.entity.AbstractNode convertTo(java.lang.Long nodeId) {
    if (nodeId == null)
        return null;
    
    return ((org.structr.core.entity.AbstractNode) (org.structr.core.Services.command(org.structr.core.node.FindNodeCommand.class).execute(new org.structr.core.entity.SuperUser(), nodeId)));
}