private int[] getBackgroundImage() {
    if ((buffBackground) == null) {
        return null;
    }
    int[] pixels = new int[]{ 0 };
    if ((camera) == (br.edu.ifsp.capture.ShowObject.COLOR)) {
        pixels = getColorPixel();
    }else {
        pixels = getDepthPixel();
    }
    return pixels;
}