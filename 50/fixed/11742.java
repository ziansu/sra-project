public void removeStaff(org.bukkit.entity.Player p) {
    if (staffList.contains(p.getDisplayName()))
        staffList.remove(p.getDisplayName());
    
}