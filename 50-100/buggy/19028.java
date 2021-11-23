@java.lang.Override
public void save(java.lang.Long contactId, org.springframework.web.multipart.MultipartFile file, java.lang.String attachmentDto) {
    if (!(file.isEmpty())) {
        try {
            java.lang.Long attachmentId = saveDetails(attachmentDto, contactId);
            saveFile(contactId, file.getInputStream(), attachmentId);
        } catch (java.io.IOException ex) {
            com.itechart.security.web.service.impl.ContactAttachmentServiceImpl.logger.error("can't save attachment", ex);
            throw new java.lang.RuntimeException("can't save attachment", ex);
        }
    }else {
        com.itechart.security.web.service.impl.ContactAttachmentServiceImpl.logger.warn("attachment wasn't added, because file is not present");
        throw new java.lang.RuntimeException("Expected a file, but no file was found.");
    }
}