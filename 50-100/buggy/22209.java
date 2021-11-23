@com.google.appinventor.components.annotations.DesignerProperty(editorType = com.google.appinventor.components.common.PropertyTypeConstants.PROPERTY_TYPE_ASSET, defaultValue = "")
@com.google.appinventor.components.annotations.SimpleProperty(category = com.google.appinventor.components.annotations.PropertyCategory.BEHAVIOR, userVisible = true)
public void JavaScriptLibrary(java.lang.String path) {
    this.jsLibraryPath = path;
    if ((path == null) | (path.equals(""))) {
        return ;
    }else {
        webview.loadUrl(com.google.appinventor.components.runtime.util.MediaUtil.createAssetURLString(path, container.$form()));
    }
}