public void setImage(java.lang.String image) {
    this.image = image;
    setMyImage(com.example.chowdi.qremind.utils.Commons.convertBase64ToBitmap(image));
}