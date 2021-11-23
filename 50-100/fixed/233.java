public static org.obeonetwork.m2doc.util.PictureType toType(org.eclipse.emf.common.util.URI pictureURI) {
    org.obeonetwork.m2doc.util.PictureType res = null;
    if ((pictureURI.fileExtension()) != null) {
        java.lang.String extension = pictureURI.fileExtension();
        try {
            res = org.obeonetwork.m2doc.util.PictureType.valueOf(extension.toUpperCase());
        } catch (java.lang.IllegalArgumentException ignored) {
        }
    }
    if (res == null) {
        res = org.obeonetwork.m2doc.util.PictureType.JPG;
    }
    return res;
}