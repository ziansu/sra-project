public java.lang.String getItemLocation(java.lang.String name, java.lang.String contentType, com.shareplaylearn.models.ItemSchema.PresentationType presentationType) {
    return (this.getItemDirectory(contentType, presentationType)) + name;
}