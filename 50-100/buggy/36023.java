private java.lang.String uploadImage(java.io.File file) {
    java.lang.String uploadedUrl;
    try {
        java.util.Map uploadResult = cloudinary.uploader().upload(file, com.cloudinary.utils.ObjectUtils.asMap("public_id", "url"));
        uploadedUrl = ((java.lang.String) (uploadResult.get("url")));
        java.lang.System.out.println(uploadedUrl);
    } catch (java.io.IOException e) {
        uploadedUrl = "";
        e.printStackTrace();
    }
    return uploadedUrl;
}