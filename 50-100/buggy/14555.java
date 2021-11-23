public java.lang.String getEncodedPicture() throws java.lang.Exception {
    if (((getPhotoThumbURL()) != null) && (!("".equals(getPhotoThumbURL())))) {
        encodedPicture = id.base.app.encryptor.EncodeDecode.getBase64FromLink(getPhotoThumbURL());
    }else
        if (((getPhotoURL()) != null) && (!("".equals(getPhotoURL())))) {
            encodedPicture = id.base.app.encryptor.EncodeDecode.getBase64FromLink(getPhotoURL());
        }
    
    return encodedPicture;
}