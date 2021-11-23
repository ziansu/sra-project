@org.junit.Test
public void getDefaultDocumentRef() {
    assertEquals(((at.fhj.swd13.pse.test.service.DocumentServiceIT.imageFolderUrl) + "default_message_icon.jpg"), at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.getDefaultDocumentRef(DocumentCategory.MESSAGE_ICON));
    assertEquals(((at.fhj.swd13.pse.test.service.DocumentServiceIT.imageFolderUrl) + "default_user_image.jpg"), at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.getDefaultDocumentRef(DocumentCategory.USER_IMAGE));
}