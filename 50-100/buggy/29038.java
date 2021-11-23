public com.inipage.homelylauncher.widgets.WidgetContainer findContainer(java.lang.String packageName) {
    for (int i = 0; i < (widgets.size()); i++) {
        if (packageName.equalsIgnoreCase(widgets.get(i).getWidgetPackage())) {
            return widgets.get(i);
        }
    }
    return null;
}