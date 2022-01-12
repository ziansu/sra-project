private void addPhotos(java.lang.Integer id, java.util.List<org.springframework.web.multipart.MultipartFile> photos) {
    java.lang.String contextPath = servletContext.getRealPath("/pages/");
    for (org.springframework.web.multipart.MultipartFile file : photos) {
        try {
            org.apache.commons.io.FileUtils.writeByteArrayToFile(new java.io.File(((((contextPath + "/images/albums/") + id) + "/") + (file.getOriginalFilename()))), file.getBytes());
        } catch (java.io.IOException e) {
        }
    }
}