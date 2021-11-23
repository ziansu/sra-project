private void upload(com.webessay.model.Messages msg, org.springframework.web.multipart.MultipartFile file) throws java.lang.Exception {
    com.webessay.model.Uploadfile entity = new com.webessay.model.Uploadfile();
    entity.setFileContentType(file.getContentType());
    entity.setFileName(file.getOriginalFilename());
    entity.setFileSize(file.getSize());
    entity.setFile(file.getBytes());
    uploadrepo.save(entity);
    msg.setFileId(entity.getId());
}