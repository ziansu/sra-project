public java.lang.String execute() throws java.lang.Exception {
    java.lang.System.out.println(file);
    java.lang.System.out.println(this.getFileFileName());
    if ((file) != null) {
        for (int i = 0; i < (file.size()); i++) {
            this.uploadFile(i);
        }
    }
    return "success";
}