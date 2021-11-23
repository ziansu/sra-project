public org.openlca.cloud.model.data.DatasetDescriptor getDescriptor() {
    if ((remote) != null)
        return toDescriptor(remote);
    
    return local.getDescriptor();
}