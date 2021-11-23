private boolean isPhotoIncorrect(javax.servlet.http.Part photo) {
    return ((photo == null) || (!("image/jpeg".equals(photo.getContentType())))) || ((photo.getSize()) == 0);
}