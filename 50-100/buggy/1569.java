public void setInventoryIcon(java.lang.String inventoryIcon) {
    java.io.File file = getFile();
    if (file != null) {
        if (!(file.isDirectory()))
            file = file.getParentFile();
        
        setInventoryIconFile(new java.io.File(file, inventoryIcon));
    }else {
        _inventoryIconFileName = inventoryIcon;
    }
}