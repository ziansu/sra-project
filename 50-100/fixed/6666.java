private void upload(com.webessay.model.Orders orders, org.springframework.web.multipart.MultipartFile file) throws java.lang.Exception {
    if ((file.getSize()) > 0) {
        com.webessay.model.Uploadfile entity = new com.webessay.model.Uploadfile();
        entity.setFileContentType(file.getContentType());
        entity.setFileName(file.getOriginalFilename());
        entity.setFileSize(file.getSize());
        entity.setFile(file.getBytes());
        uploadrepo.save(entity);
        orders.setFileId(entity.getId());
    }
}