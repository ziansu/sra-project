public void setInventoryIcon(java.lang.String inventoryIcon) {
    if (inventoryIcon == null) {
        _inventoryIconFileName = null;
        setInventoryIconFile(null);
    }else {
        java.io.File file = getFile();
        if (file != null) {
            if (!(file.isDirectory()))
                file = file.getParentFile();
            
            setInventoryIconFile(new java.io.File(file, inventoryIcon));
        }else {
            _inventoryIconFileName = inventoryIcon;
        }
    }
}