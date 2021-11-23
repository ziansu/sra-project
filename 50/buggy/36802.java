@org.junit.Test
public void getDefaultDocumentRef() {
    org.junit.Assert.assertEquals(((at.fhj.swd13.pse.test.service.DocumentServiceIT.imageFolderUrl) + "default_message_icon.jpg"), at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.getDefaultDocumentRef(DocumentCategory.MESSAGE_ICON));
    org.junit.Assert.assertEquals(((at.fhj.swd13.pse.test.service.DocumentServiceIT.imageFolderUrl) + "default_user_image.jpg"), at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.getDefaultDocumentRef(DocumentCategory.USER_IMAGE));
}