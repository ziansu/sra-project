@javax.annotation.Nullable
private co.cask.cdap.app.program.Program validateProgramForRunRecord(java.lang.String namespaceName, java.lang.String appName, co.cask.cdap.proto.ProgramType programType, java.lang.String programName, java.lang.String runId) {
    co.cask.cdap.proto.Id.Program programId = Id.Program.from(namespaceName, appName, programType, programName);
    co.cask.cdap.proto.RunRecord runRecord = store.getRun(programId, runId);
    if (runRecord != null) {
        return programId;
    }else {
        return null;
    }
}