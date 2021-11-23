@java.lang.Override
public void setFile(java.io.File file) {
    java.lang.String inventoryIconFileName = getInventoryIcon();
    boolean setInventoryName = (getInventoryIconFile()) == null;
    super.setFile(file);
    if (setInventoryName)
        setInventoryIcon(inventoryIconFileName);
    
}