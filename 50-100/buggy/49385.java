public void setValueAt(java.lang.Object value, java.lang.Object nodeObject, int column) {
    if (nodeObject instanceof org.openmicroscopy.shoola.agents.measurement.util.roitable.ROINode) {
        org.openmicroscopy.shoola.agents.measurement.util.roitable.ROINode node = ((org.openmicroscopy.shoola.agents.measurement.util.roitable.ROINode) (nodeObject));
        if (column == ((org.openmicroscopy.shoola.agents.measurement.util.roitable.ROITableModel.ANNOTATION_COLUMN) + 1)) {
            if (value == null)
                value = "";
            else
                if (value.equals(""))
                    value = " ";
                
            
        }
        node.setValueAt(value, column);
        modelSupport.fireNewRoot();
    }
}