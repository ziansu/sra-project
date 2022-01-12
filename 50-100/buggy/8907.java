private void processPicture(javax.servlet.http.Part picture, com.lavalloisir.beans.User user) {
    java.lang.String pictureName = null;
    try {
        pictureName = getFileName(picture);
        validPictureName(pictureName);
        writeFile(picture, pictureName);
    } catch (java.lang.Exception e) {
        setError(com.lavalloisir.forms.RegistrationForm.FIELD_PICTURE, e.getMessage());
    }
    java.lang.String localPath = path.substring(path.indexOf("/img"));
    user.setPicture((("/Lavalloisir" + localPath) + pictureName));
}