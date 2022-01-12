@org.junit.Ignore
@org.junit.Test
public void testGetAttachmentById() throws com.taskadapter.redmineapi.RedmineException {
    int attachmentID = 1;
    com.taskadapter.redmineapi.bean.Attachment attachment = com.taskadapter.redmineapi.AttachmentIntegrationTest.attachmentManager.getAttachmentById(attachmentID);
    org.junit.Assert.assertNotNull((("Attachment retrieved by ID " + attachmentID) + " should not be null"), attachment);
    org.junit.Assert.assertNotNull((("Content URL of attachment retrieved by ID " + attachmentID) + " should not be null"), attachment.getContentURL());
}