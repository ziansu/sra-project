public java.lang.String getVillagerName(int profession, int career) {
    java.util.Map<java.lang.Integer, java.lang.String> map = this.villagerNames.get(profession);
    if (map == null)
        return "Unknown";
    
    java.lang.String id = map.get(career);
    if (id == null)
        return "Unknown";
    
    return "entity.Villager." + id;
}