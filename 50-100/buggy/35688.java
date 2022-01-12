public static int gray_to_rgb(int gray) {
    int ret;
    if (gray > (filter2d.MAX_GRAY_LEVEL)) {
        ret = filter2d.MAX_GRAY_LEVEL;
    }else
        if (gray < 0) {
            ret = 0;
        }else {
            ret = gray;
        }
    
    ret = (ret << 8) | gray;
    ret = (ret << 8) | gray;
    return ret;
}