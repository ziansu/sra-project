public static void writeAttachments(java.lang.Long id, java.util.ArrayList<org.apache.commons.fileupload.FileItem> attachments) {
    for (org.apache.commons.fileupload.FileItem fileItem : attachments) {
        com.zhartunmatthew.web.contactbook.services.fileservice.AttachmentService.writeFile(fileItem, id);
    }
}