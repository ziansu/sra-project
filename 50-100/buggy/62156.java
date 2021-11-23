@org.testng.annotations.Test
public void computeDirectoryNameForMessageWithNoChannel() throws java.io.IOException {
    eu.peppol.start.persistence.SimpleMessageRepository simpleMessageRepository = new eu.peppol.start.persistence.SimpleMessageRepository();
    eu.peppol.start.identifier.PeppolMessageHeader h = new eu.peppol.start.identifier.PeppolMessageHeader();
    h.setRecipientId(new eu.peppol.start.identifier.ParticipantId("9908:976098897"));
    h.setSenderId(new eu.peppol.start.identifier.ParticipantId("9908:123456789"));
    java.lang.String tmpdir = "/tmpx";
    java.io.File dirName = simpleMessageRepository.computeDirectoryNameForMessage(tmpdir, h);
    org.testng.Assert.assertEquals(dirName.getCanonicalPath(), (tmpdir + "/9908_976098897/9908_123456789"), "Invalid directory name computed");
}