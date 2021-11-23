@java.lang.Override
public void setFile(java.io.File file) {
    boolean setInventoryName = (getInventoryIconFile()) == null;
    java.lang.String inventoryIconFileName = getInventoryIcon();
    super.setFile(file);
    if (setInventoryName)
        setInventoryIcon(inventoryIconFileName);
    
}