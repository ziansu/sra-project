public boolean save() {
    if (mSavedChanges)
        return true;
    
    try {
        java.io.FileOutputStream out = new java.io.FileOutputStream(mFile);
        mSavedChanges = save(out);
        out.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    if ((mFile.isFile()) && ((mFile.length()) == 0))
        mFile.delete();
    
    return false;
}