public void updateVillageStatus(com.potatoes.cultivation.logic.Player p) {
    for (com.potatoes.cultivation.logic.Village v : getVillages(p)) {
        if (v.getStatus().equals(VillageStatus.StartUpgrading)) {
            v.updateStatus(VillageStatus.StillUpgrading);
        }else {
            v.upgradeVillageType();
            v.updateStatus(VillageStatus.VillageReady);
        }
    }
}