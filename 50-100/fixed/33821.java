@javax.annotation.Nonnull
private static com.adobe.granite.ui.clientlibs.LibraryType getLibraryType(@javax.annotation.Nonnull
final java.lang.String path) throws com.dal.fingerprinting.service.IncompatibleResourceTypeException {
    if (org.apache.commons.lang3.StringUtils.endsWith(path, LibraryType.CSS.extension)) {
        return com.adobe.granite.ui.clientlibs.LibraryType.CSS;
    }else
        if (org.apache.commons.lang3.StringUtils.endsWith(path, LibraryType.JS.extension)) {
            return com.adobe.granite.ui.clientlibs.LibraryType.JS;
        }else {
            throw new com.dal.fingerprinting.service.IncompatibleResourceTypeException("Can not determine the library type");
        }
    
}