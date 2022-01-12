public void find(java.lang.String objtosearch, java.lang.String atr2) {
    if (objtosearch != null) {
        if (atr2 == null) {
            new commandline.controller.helperUtilies.MyFileSearch(objtosearch, currentLocation.getAbsolutePath());
        }else {
            if ((locationController(atr2)) != null) {
                new commandline.controller.helperUtilies.MyFileSearch(objtosearch, locationController(atr2).getAbsolutePath());
            }else {
                java.lang.System.out.println("Chek the path you enter");
            }
        }
    }
}