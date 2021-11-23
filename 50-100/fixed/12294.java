@java.lang.Override
public java.lang.String getSubAwardXmlFileData() {
    if ((subAwardXmlFileData) != null) {
        return subAwardXmlFileData.get();
    }
    byte[] newData = getKcAttachmentDao().getData(xmlDataId);
    java.lang.String newString = (newData != null) ? new java.lang.String(newData) : null;
    subAwardXmlFileData = new java.lang.ref.SoftReference<java.lang.String>(newString);
    return newString;
}