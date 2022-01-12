public static java.lang.String path(java.lang.String s) {
    java.net.URL url = org.numenta.nupic.datagen.ResourceLocator.class.getResource(s);
    if (url == null) {
        url = org.numenta.nupic.datagen.ResourceLocator.class.getClassLoader().getResource(s);
    }
    return url.getPath();
}