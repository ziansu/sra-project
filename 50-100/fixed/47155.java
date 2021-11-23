public java.awt.image.BufferedImage filter(int type, int param) {
    java.awt.image.BufferedImage filter_BufferedImage = null;
    if (type == (filter2d.FILTER_TYPE_AVERAGY)) {
        filter_BufferedImage = averagy_filter2d(param);
    }else
        if (type == (filter2d.FILTER_TYPE_LAPLACE)) {
            filter_BufferedImage = laplace_filter2d(param);
        }else
            if (type == (filter2d.FILTER_TYPE_HIGH_BOOSTING)) {
            }else {
                return null;
            }
        
    
    return filter_BufferedImage;
}