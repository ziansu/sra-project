private byte[] getImageBytes(org.springframework.web.multipart.MultipartFile filePhoto) {
    if (filePhoto == null) {
        return null;
    }
    byte[] photoFileBytes = new byte[((int) (filePhoto.getSize()))];
    try {
        java.io.FileInputStream fileInputStream = ((java.io.FileInputStream) (filePhoto.getInputStream()));
        fileInputStream.read(photoFileBytes);
        fileInputStream.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return photoFileBytes;
}