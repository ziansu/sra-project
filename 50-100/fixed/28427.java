@org.junit.Test
public void testDownloadFileFromServer_ResponseError() throws com.jcraft.jsch.JSchException, com.jcraft.jsch.SftpException, com.veritomyx.actions.BaseAction.ResponseFormatException, java.io.IOException, java.lang.IllegalStateException, java.lang.InterruptedException, net.sf.mzmine.modules.rawdatamethods.peakpicking.massdetection.PeakInvestigator.PeakInvestigatorTask.ResponseErrorException {
    thrown.expect(net.sf.mzmine.modules.rawdatamethods.peakpicking.massdetection.PeakInvestigator.PeakInvestigatorTask.ResponseErrorException.class);
    thrown.expectMessage("Invalid username or password");
    java.lang.String response = BaseAction.ERROR_CREDENTIALS.replace("ACTION", "SFTP");
    net.sf.mzmine.modules.rawdatamethods.peakpicking.massdetection.PeakInvestigator.PeakInvestigatorTask task = createDownloadTask(response);
    task.downloadFileFromServer("test.tar", new java.io.File("test_local.tar"));
    fail("Should not reach here.");
}