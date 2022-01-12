public void renameResidence(java.lang.String oldResidence, java.lang.String newResidence) {
    if (oldResidence == null)
        return ;
    
    if (newResidence == null)
        return ;
    
    oldResidence = oldResidence.toLowerCase();
    com.bekvon.bukkit.residence.protection.ClaimedResidence res = ResidenceList.get(oldResidence);
    if (res != null) {
        removeResidence(oldResidence);
        ResidenceList.put(newResidence.toLowerCase(), res);
    }
}