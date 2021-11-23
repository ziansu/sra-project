public static int computeBitmapSimple(int realPixels, int maxPixels) {
    try {
        if (realPixels <= maxPixels) {
            return 1;
        }else {
            int scale = 2;
            while ((realPixels / (scale * scale)) > maxPixels) {
                scale *= 2;
            } 
            return scale;
        }
    } catch (java.lang.Exception e) {
        return 1;
    }
}