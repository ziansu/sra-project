private static java.util.ArrayList<com.emrahdayioglu.bean.ImageBean> getImagesFromDB(java.lang.String name, com.emrahdayioglu.constants.ImageType type, int elementId, com.emrahdayioglu.constants.ImageStatus imageStatus) {
    java.lang.String status = (imageStatus == null) ? "" : imageStatus.toString();
    java.util.ArrayList<com.emrahdayioglu.bean.ImageBean> images = com.emrahdayioglu.db.DBUtil.getImages(name, status, elementId, type.toString(), "");
    return images;
}