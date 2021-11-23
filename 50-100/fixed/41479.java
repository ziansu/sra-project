@java.lang.Override
public java.awt.Component getListCellRendererComponent(javax.swing.JList<? extends org.openstreetmap.josm.data.osm.OsmPrimitive> list, org.openstreetmap.josm.data.osm.OsmPrimitive value, int index, boolean isSelected, boolean cellHasFocus) {
    java.awt.Component def = defaultListCellRenderer.getListCellRendererComponent(list, null, index, isSelected, cellHasFocus);
    return renderer(def, value, ((list.getModel().getSize()) > 1000));
}