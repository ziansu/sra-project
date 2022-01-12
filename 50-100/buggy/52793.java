private org.eclipse.jface.resource.ImageDescriptor createImageDescriptor(final java.lang.String name) {
    final java.lang.String path = new java.lang.StringBuilder(fr.faylixe.jammy.ui.JammyUI.ICONS_PATH).append(name).append(fr.faylixe.jammy.ui.JammyUI.ICON_EXTENSION).toString();
    final java.net.URL url = getClass().getResource(path);
    java.lang.System.out.println(url);
    return org.eclipse.jface.resource.ImageDescriptor.createFromURL(url);
}