protected java.io.File loadUserFile(java.lang.String inUserName) {
    org.openedit.repository.ContentItem stub = getPageManager().getRepository().getStub(((((getUserDirectory()) + "/") + inUserName) + ".xml"));
    java.io.File file = new java.io.File(stub.getAbsolutePath());
    if (!(file.getParentFile().exists())) {
        file.getParentFile().mkdirs();
    }
    return file;
}