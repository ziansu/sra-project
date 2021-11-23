public boolean isAddable(java.lang.String str) {
    if (isExist(str))
        return false;
    
    if (isShortcut(str)) {
        try {
            if ((getShortcut(str)) != null)
                return false;
            
        } catch (java.lang.Exception e) {
            return false;
        }
    }
    return true;
}