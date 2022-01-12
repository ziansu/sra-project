@org.junit.Test
public void testDownloadFileFromServer_ResponseHTML() throws com.jcraft.jsch.JSchException, com.jcraft.jsch.SftpException, com.veritomyx.actions.BaseAction.ResponseFormatException, java.io.IOException, java.lang.IllegalStateException, java.lang.InterruptedException, net.sf.mzmine.modules.rawdatamethods.peakpicking.massdetection.PeakInvestigator.PeakInvestigatorTask.ResponseErrorException {
    thrown.expect(com.veritomyx.actions.BaseAction.ResponseFormatException.class);
    thrown.expectMessage("Server response appears to be HTML/XML");
    net.sf.mzmine.modules.rawdatamethods.peakpicking.massdetection.PeakInvestigator.PeakInvestigatorTask task = createDownloadTask(BaseAction.API_SOURCE);
    task.downloadFileFromServer("test.tar", new java.io.File("test_local.tar"));
    fail("Should not reach here.");
}