public void addResidence(com.bekvon.bukkit.residence.protection.ClaimedResidence residence) {
    if (residence == null)
        return ;
    
    this.ResidenceList.put(residence.getName().toLowerCase(), residence);
}