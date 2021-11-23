public javax.swing.Icon getIcon() {
    if ((size) <= 1)
        return icon;
    else
        return org.openstreetmap.josm.tools.ImageProvider.get("data", multipleClassname);
    
}