public boolean canCraftItem(org.bukkit.inventory.ItemStack stack) {
    for (com.gamingmesh.jobs.container.Job j : com.gamingmesh.jobs.Jobs.getJobs()) {
        if (!(j.isRestrictedItem(stack)))
            continue;
        
        if ((this.getJobProgression(j)) != null) {
            if ((this.getJobProgression(j).getLevel()) < (j.getLevelRequiredToCraft(stack))) {
                return false;
            }
        }
    }
    return true;
}