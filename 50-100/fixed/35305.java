public com.dtolabs.rundeck.core.execution.ExecutionContextImpl.Builder nodeContextData(com.dtolabs.rundeck.core.common.INodeEntry node) {
    ctx.dataContext.remove("node");
    ctx.dataContext.merge(new com.dtolabs.rundeck.core.execution.BaseDataContext("node", com.dtolabs.rundeck.core.execution.DataContextUtils.nodeData(node)));
    ctx.sharedDataContext.merge(com.dtolabs.rundeck.core.execution.ContextView.node(node.getNodename()), new com.dtolabs.rundeck.core.execution.BaseDataContext("node", com.dtolabs.rundeck.core.execution.DataContextUtils.nodeData(node)));
    return this;
}