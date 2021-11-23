private static void checkIfExtensionIsEnabled(java.lang.String extensionName) {
    org.apache.falcon.extensions.jdbc.ExtensionMetaStore metaStore = org.apache.falcon.extensions.store.ExtensionStore.getMetaStore();
    if (metaStore.getDetail(extensionName).getStatus().equals(ExtensionStatus.ENABLED.toString())) {
        throw org.apache.falcon.FalconWebException.newAPIException((("Extension: " + extensionName) + " is in disabled state."), Response.Status.INTERNAL_SERVER_ERROR);
    }
}