@java.lang.Override
public org.apache.twill.filesystem.Location get(co.cask.cdap.proto.Id.Namespace namespaceId, @javax.annotation.Nullable
java.lang.String subPath) throws java.io.IOException {
    java.lang.String namespacesDir = cConf.get(Constants.Namespace.NAMESPACES_DIR);
    org.apache.twill.filesystem.Location namespaceLocation = locationFactory.create(namespacesDir).append(namespaceId.getId());
    if (subPath != null) {
        namespaceLocation.append(subPath);
    }
    return namespaceLocation;
}