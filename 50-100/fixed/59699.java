public boolean runScript(edu.uwb.braingrid.provenance.ProvMgr provMgr, edu.uwb.braingrid.workbench.model.SimulationSpecification simSpec, java.lang.String scriptPath, java.lang.String scriptVersion, java.lang.String[] nListFilenames, java.lang.String simConfigFilename) throws com.jcraft.jsch.JSchException, com.jcraft.jsch.SftpException, java.io.FileNotFoundException {
    boolean success;
    java.lang.String executionMachine = simSpec.getSimulationLocale();
    java.lang.String remoteExecution = edu.uwb.braingrid.workbench.model.SimulationSpecification.REMOTE_EXECUTION;
    if (executionMachine.equals(remoteExecution)) {
        success = runRemoteScript(provMgr, simSpec, scriptPath, scriptVersion, nListFilenames, simConfigFilename);
    }else {
        success = runLocalScript(provMgr, simSpec, scriptPath, scriptVersion, nListFilenames, simConfigFilename);
    }
    return success;
}