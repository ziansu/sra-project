public static void main(java.lang.String[] args) {
    java.io.File file = new java.io.File("C:\\Posts\\Zamuna\\Desktop\\car.png");
    com.classified.controller.PostController postController = new com.classified.controller.PostController();
    java.io.InputStream uploadedInputStream = null;
    try {
        uploadedInputStream = new java.io.FileInputStream(file);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
    com.sun.jersey.core.header.FormDataContentDisposition formDataContentDisposition = null;
}