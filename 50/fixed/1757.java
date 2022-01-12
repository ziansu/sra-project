@java.lang.Override
public java.lang.String apiFileFolder() {
    return ((((outputFolder) + (java.io.File.separator)) + (sourceFolder)) + (java.io.File.separator)) + (apiPackage().replace('.', java.io.File.separatorChar));
}