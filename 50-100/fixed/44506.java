public java.util.List<edu.msg.ro.persistence.entity.Attachment> getAttachments() {
    java.util.List<edu.msg.ro.persistence.entity.Attachment> attachments = new java.util.ArrayList<edu.msg.ro.persistence.entity.Attachment>();
    for (org.primefaces.model.UploadedFile f : uploadedFiles) {
        edu.msg.ro.persistence.entity.Attachment a = new edu.msg.ro.persistence.entity.Attachment();
        a.setFileName(f.getFileName());
        a.setFileContent(f.getContents());
        a.setFileType(f.getContentType());
        attachments.add(a);
    }
    uploadedFiles = new java.util.ArrayList<org.primefaces.model.UploadedFile>();
    return attachments;
}