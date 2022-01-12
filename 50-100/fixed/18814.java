private java.lang.String getImageUrl(com.baasbox.android.BaasFile image) {
    java.lang.String streamUri = image.getStreamUri().toString();
    java.lang.String[] temp = streamUri.split("=");
    java.lang.StringBuilder stbuild = new java.lang.StringBuilder("");
    stbuild.append(temp[1]).append("=");
    return stbuild.toString();
}