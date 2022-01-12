@java.lang.Override
protected void handleTreeExpand(org.eclipse.swt.events.TreeEvent event) {
    if ((event.item.getData()) instanceof org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl) {
        org.slizaa.ui.common.context.BusyCursor.execute(getTree().getParent(), () -> {
            if ((_eventInterceptor) != null) {
                _eventInterceptor.handleTreeExpand(((org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl) (event.item.getData())));
            }
            org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl hgNode = ((org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl) (event.item.getData()));
            hgNode.onExpand();
        });
    }
    super.handleTreeExpand(event);
}