public static void init(javax.servlet.ServletContext servletContext) {
    java.io.File repository = ((java.io.File) (servletContext.getAttribute("javax.servlet.context.tempdir")));
    org.edagarli.framework.helper.UploadHelper.servletFileUpload = new org.apache.commons.fileupload.servlet.ServletFileUpload(new org.apache.commons.fileupload.disk.DiskFileItemFactory(org.apache.commons.fileupload.disk.DiskFileItemFactory.DEFAULT_SIZE_THRESHOLD, repository));
    org.edagarli.framework.helper.UploadHelper.servletFileUpload = new org.apache.commons.fileupload.servlet.ServletFileUpload(new org.apache.commons.fileupload.disk.DiskFileItemFactory(org.apache.commons.fileupload.disk.DiskFileItemFactory.DEFAULT_SIZE_THRESHOLD, repository));
    int uploadLimit = org.edagarli.framework.helper.ConfigHelper.getAppUploadLimit();
    if (uploadLimit != 0) {
        org.edagarli.framework.helper.UploadHelper.servletFileUpload.setFileSizeMax(((uploadLimit * 1024) * 1024));
    }
}