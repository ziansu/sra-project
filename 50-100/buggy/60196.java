@java.lang.Override
public void setValueAt(java.lang.Object o, int row, int column) {
    org.openstreetmap.josm.data.imagery.ImageryInfo info = layerInfo.getLayers().get(row);
    switch (column) {
        case 0 :
            info.setName(((java.lang.String) (o)));
            break;
        case 1 :
            info.setExtendedUrl(((java.lang.String) (o)));
            break;
        default :
            throw new java.lang.ArrayIndexOutOfBoundsException();
    }
}