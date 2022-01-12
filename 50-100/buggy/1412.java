private java.lang.String getSpecificOrientationString(int orientation) {
    switch (orientation) {
        case android.content.res.Configuration.ORIENTATION_PORTRAIT :
            {
                return "PORTRAIT";
            }
        case 90 :
            {
                return "LANDSCAPE-LEFT";
            }
        case 180 :
            {
                return "PORTRAITUPSIDEDOWN";
            }
        case 270 :
            {
                return "LANDSCAPE-RIGHT";
            }
        default :
            {
                return "UNKNOWN";
            }
    }
}