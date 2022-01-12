private boolean groupCompleted(Model.Group grp) {
    if ((grp.containsValue(0)) != null)
        return false;
    
    for (int i = 1; i <= 9; i++)
        if ((grp.containsValue(i)) == null)
            return false;
        
    
    return true;
}