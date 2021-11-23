protected java.lang.Object visitContainer(net.objectof.actof.porter.visitor.IPorterContext context, net.objectof.model.Id<?> parentId) {
    net.objectof.model.Resource<net.objectof.aggr.Aggregate<java.lang.Object, java.lang.Object>> toParent = getToParent(parentId);
    net.objectof.actof.porter.visitor.IPorterContext ported = transform(context);
    if (ported.isDropped()) {
        return null;
    }
    if (toParent == null) {
        return null;
    }
    toParent.value().set(net.objectof.actof.porter.IPorterUtil.unqualify(ported.getKey(), toParent), ported.getValue());
    return context.getValue();
}