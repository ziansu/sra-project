public java.lang.String getEncodedPicture() throws java.lang.Exception {
    if (((getPhotoThumbURL()) != null) && (!("".equals(getPhotoThumbURL())))) {
        encodedPicture = getPhotoThumbURL();
    }else
        if (((getPhotoURL()) != null) && (!("".equals(getPhotoURL())))) {
            encodedPicture = getPhotoURL();
        }
    
    return encodedPicture;
}