public void addResidence(com.bekvon.bukkit.residence.protection.ClaimedResidence residence) {
    if (residence == null)
        return ;
    
    java.lang.String name = residence.getName();
    name = name.toLowerCase();
    this.ResidenceList.put(name, residence);
}