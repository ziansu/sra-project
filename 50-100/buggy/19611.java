private java.util.List<java.lang.String> getFileNames() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>(2);
    if (((type) & (itdelatrisu.opsu.GameImage.IMG_PNG)) != 0)
        list.add(java.lang.String.format("%s.png", filename));
    
    if (((type) & (itdelatrisu.opsu.GameImage.IMG_JPG)) != 0)
        list.add(java.lang.String.format("%s.jpg", filename));
    
    return list;
}