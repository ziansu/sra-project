public bibliothek.gui.dock.common.intern.CommonSingleDockableLayout read(bibliothek.util.xml.XElement element, bibliothek.gui.dock.station.support.PlaceholderStrategy placeholders) {
    bibliothek.gui.dock.common.intern.CommonSingleDockableLayout layout = new bibliothek.gui.dock.common.intern.CommonSingleDockableLayout();
    layout.setId(element.getElement("id").getString());
    bibliothek.util.xml.XElement xarea = element.getElement("area");
    if (xarea != null) {
        java.lang.String area = element.getString();
        if ("".equals(area)) {
            layout.setArea(null);
        }else {
            layout.setArea(area);
        }
    }
    return layout;
}