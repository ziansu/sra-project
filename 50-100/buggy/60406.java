public java.awt.Image getImageFromPath(java.lang.String path) {
    java.awt.Image result = tcg_auto.hci.HCI.images.get(path);
    if (result == null) {
        java.lang.System.out.println(("getting image " + path));
        getClass();
        try {
            result = javax.imageio.ImageIO.read(tcg_auto.utils.HCIUtils.getUrlFromPath(path));
            tcg_auto.hci.HCI.images.put(path, result);
        } catch (java.io.IOException | java.lang.IllegalArgumentException e) {
            tcg_auto.utils.HCIUtils.showException(e, false);
        }
    }
    return result;
}