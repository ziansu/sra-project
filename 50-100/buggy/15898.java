@java.lang.Override
public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    org.openstreetmap.josm.gui.history.TwoColumnDiff.Item member = ((org.openstreetmap.josm.gui.history.TwoColumnDiff.Item) (value));
    renderIcon(((org.openstreetmap.josm.data.osm.RelationMemberData) (member.value)));
    switch (column) {
        case 0 :
            renderRole(member);
            break;
        case 1 :
            renderPrimitive(member);
            break;
    }
    return this;
}