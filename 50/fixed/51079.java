@java.lang.Override
protected void configure() {
    bind(com.googlesource.gerrit.plugins.verifystatus.server.schema.SchemaVersion.class).to(SchemaVersion.C);
}