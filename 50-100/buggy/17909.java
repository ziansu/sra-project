public java.lang.String execute() throws java.lang.Exception {
    java.lang.System.out.println("UploadAction execute()");
    java.lang.System.out.println(this.getFileFileName());
    for (int i = 0; i < (file.size()); i++) {
        this.uploadFile(i);
    }
    return "success";
}