public boolean accept(java.io.File dir, java.lang.String name) {
    if (!(name.startsWith("."))) {
        return false;
    }else
        if ((!(name.endsWith(".png"))) && (!(name.endsWith(".jpg")))) {
            return false;
        }
    
    return true;
}