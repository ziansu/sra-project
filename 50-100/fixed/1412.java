private java.lang.String getSpecificOrientationString(int orientation) {
    switch (orientation) {
        case 0 :
            {
                return "PORTRAIT";
            }
        case 90 :
            {
                return "LANDSCAPE-RIGHT";
            }
        case 180 :
            {
                return "PORTRAITUPSIDEDOWN";
            }
        case 270 :
            {
                return "LANDSCAPE-LEFT";
            }
        default :
            {
                return "UNKNOWN";
            }
    }
}