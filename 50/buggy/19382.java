private void createIfNotExists(co.cask.cdap.proto.Id.Namespace namespace, java.lang.String name, co.cask.cdap.proto.DatasetInstanceConfiguration props) throws java.lang.Exception {
    try {
        create(namespace, name, props);
    } catch (co.cask.cdap.common.DatasetAlreadyExistsException e) {
    }
}