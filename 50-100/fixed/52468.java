protected MDSKey.Builder getVersionLessProgramKeyBuilder(java.lang.String recordType, @javax.annotation.Nullable
co.cask.cdap.proto.id.ProgramRunId programRunId) {
    co.cask.cdap.data2.dataset2.lib.table.MDSKey.Builder builder = new co.cask.cdap.data2.dataset2.lib.table.MDSKey.Builder().add(recordType);
    if (programRunId != null) {
        builder.add(programRunId.getNamespace());
        builder.add(programRunId.getApplication());
        builder.add(programRunId.getType().name());
        builder.add(programRunId.getProgram());
    }
    return builder;
}