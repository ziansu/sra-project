public java.lang.String getVillagerName(int profession, int career) {
    java.util.Map<java.lang.Integer, java.lang.String> map = this.villagerNames.get(profession);
    if (map == null)
        return "Unknown";
    
    return "entity.Villager." + (map.get(career));
}