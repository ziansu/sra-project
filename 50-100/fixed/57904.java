public void fireUpdateRemove(final com.bekvon.bukkit.residence.protection.ClaimedResidence res, final int deep) {
    if (((api) == null) || ((set) == null))
        return ;
    
    if (res == null)
        return ;
    
    handleResidenceRemove(res.getName(), res, deep);
}