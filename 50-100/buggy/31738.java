public itn.issuemanager.domain.UploadFile store(org.springframework.web.multipart.MultipartFile file, itn.issuemanager.domain.User uploadUser) throws itn.issuemanager.domain.ForbiddenTypeFileException, java.io.IOException {
    java.lang.String fileExtension = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
    if (blackListExtentension.contains(fileExtension)) {
        throw new itn.issuemanager.domain.ForbiddenTypeFileException();
    }
    itn.issuemanager.domain.UploadFile uploadFile = new itn.issuemanager.domain.UploadFile();
    uploadFile.settingPath(this.rootLocation);
    uploadFile.tempUpload(file, uploadUser);
    fileRepository.save(uploadFile);
    return uploadFile;
}