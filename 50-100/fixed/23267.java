public static org.apache.twill.filesystem.Location getLocationFromAbsolutePath(org.apache.twill.filesystem.LocationFactory locationFactory, java.lang.String absolutePath) {
    java.net.URI basePathURI = java.net.URI.create(locationFactory.create("").toURI().getPath());
    java.net.URI locationURI = java.net.URI.create(absolutePath);
    java.net.URI relativePathURI = basePathURI.relativize(locationURI);
    return locationFactory.create(relativePathURI.getPath());
}