private java.lang.String getAlbumName() {
    java.lang.String time = com.tgs.servey.MyServey.getCurrentTimeStamp();
    java.lang.String prefixDate = time.split(":")[0];
    int minuts = java.lang.Integer.parseInt(time.split(":")[1]);
    java.lang.String minutFrame = "";
    if (minuts <= 30) {
        minutFrame = "0-29";
    }else {
        minutFrame = "30-59";
    }
    java.lang.String dirName = prefixDate + minutFrame;
    return prefixDate;
}