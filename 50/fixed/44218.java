@javax.annotation.Nullable
public static java.io.InputStream getInputStream(@javax.annotation.Nonnull
@com.helger.commons.annotation.Nonempty
final java.lang.String sPath, @javax.annotation.Nonnull
final java.lang.ClassLoader aClassLoader) {
    final java.net.URL aURL = com.helger.commons.url.URLHelper.getClassPathURL(sPath, aClassLoader);
    return com.helger.commons.io.resource.ClassPathResource._getInputStream(sPath, aURL, ((java.lang.ClassLoader) (null)));
}