public void setAttributes(org.eclipse.tcf.services.IFileSystem.FileAttrs attrs, boolean notify) {
    org.eclipse.tcf.services.IFileSystem.FileAttrs oldAttrs = fAttributes;
    fAttributes = attrs;
    if ((attrs != null) && (attrs.isFile()))
        fRefreshTime = java.lang.System.currentTimeMillis();
    
    if (notify) {
        notifyChange("attributes", oldAttrs, attrs);
    }
}