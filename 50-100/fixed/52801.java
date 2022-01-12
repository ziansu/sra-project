@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public org.eclipse.jface.resource.ImageDescriptor getImageDescriptor(mesfavoris.url.internal.Context context, mesfavoris.model.Bookmark bookmark) {
    java.lang.String iconAsBase64 = bookmark.getPropertyValue(mesfavoris.url.UrlBookmarkProperties.PROP_ICON);
    if (iconAsBase64 == null) {
        iconAsBase64 = bookmark.getPropertyValue(mesfavoris.url.UrlBookmarkProperties.PROP_FAVICON);
    }
    if (iconAsBase64 == null) {
        if ((bookmark.getPropertyValue(mesfavoris.url.UrlBookmarkProperties.PROP_URL)) != null) {
            return mesfavoris.url.internal.Activator.getImageDescriptor("icons/obj16/page_tag_blue.gif");
        }else {
            return null;
        }
    }
    byte[] favIconBytes = java.util.Base64.getDecoder().decode(iconAsBase64);
    return new mesfavoris.url.IconImageDescriptor(favIconBytes);
}