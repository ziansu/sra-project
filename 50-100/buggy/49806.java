@java.lang.Override
public java.util.Collection<java.lang.String> getCollections() throws com.bagri.core.api.BagriException {
    java.util.List<java.lang.String> clNames = new java.util.ArrayList(repo.getSchema().getCollections().size());
    for (com.bagri.core.system.Collection cln : repo.getSchema().getCollections()) {
        clNames.add(cln.getName());
    }
    return clNames;
}