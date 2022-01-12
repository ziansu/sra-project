private void startRetrieve() throws com.jcraft.jsch.JSchException, com.jcraft.jsch.SftpException, com.veritomyx.actions.BaseAction.ResponseFormatException, java.io.IOException, net.sf.mzmine.modules.rawdatamethods.peakpicking.massdetection.PeakInvestigator.PeakInvestigatorTask.ResponseErrorException {
    desc = "downloading results";
    logger.info((("Downloading job, " + (jobID)) + ", results..."));
    downloadFileFromServer(statusAction.getResultsFilename(), workingFile);
    extractScansFromTarball(workingFile);
    desc = "results downloaded";
}