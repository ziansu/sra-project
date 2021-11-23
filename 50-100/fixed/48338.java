public java.lang.Boolean isParentObject(java.lang.String objectName) {
    for (java.lang.Integer identifier : alObjectList) {
        com.ShamsNahid.Objects.ObjectInfo objectInfo = new com.ShamsNahid.Objects.ObjectInfo();
        objectInfo = hmObjectInfo.get(identifier);
        if ((objectInfo.getObjectName().equals(objectName)) == true) {
            return true;
        }
    }
    return false;
}