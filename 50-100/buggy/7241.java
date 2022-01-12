private void createHandleForActiveNode() {
    nodebox.client.Node activeNode = getActiveNode();
    if (activeNode != null) {
        nodebox.client.HandleRepository repository = nodebox.client.HandleRepository.of();
        if (repository.hasHandleClass(activeNode.getHandle())) {
            nodebox.client.Handle handle = repository.constructHandle(activeNode.getHandle());
            if (handle != null) {
                handle.setHandleDelegate(this);
                viewerPane.setHandle(handle);
            }else {
                viewerPane.setHandle(null);
            }
        }
    }
}