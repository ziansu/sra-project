public static boolean isImage(java.lang.String imgPath) {
    if (android.text.TextUtils.isEmpty(imgPath))
        return false;
    
    int begin = imgPath.lastIndexOf(".");
    int end = imgPath.length();
    if (begin == (-1))
        return false;
    
    java.lang.String imageType = imgPath.substring(begin, end);
    if (android.text.TextUtils.isEmpty(imageType))
        return false;
    
    return com.seek.biscuit.Utils.format.contains(imageType.toLowerCase());
}