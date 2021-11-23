private int[] getBackgroundImage() {
    if ((buffBackground) == null) {
        return new int[]{ 0 };
    }
    int[] pixels;
    if ((camera) == (br.edu.ifsp.capture.ShowObject.COLOR)) {
        pixels = getColorPixel();
    }else {
        pixels = getDepthPixel();
    }
    return pixels;
}