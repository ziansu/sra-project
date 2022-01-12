public static java.util.ArrayList<java.lang.Integer> getRGBValues(int pixel, java.util.ArrayList<java.lang.Integer> pixelList) {
    pixelList.add(((pixel >> 24) & 255));
    pixelList.add(((pixel >> 16) & 255));
    pixelList.add(((pixel >> 8) & 255));
    pixelList.add((pixel & 255));
    return pixelList;
}