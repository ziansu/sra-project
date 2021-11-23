public boolean canAffordGreen(uk.org.ulcompsoc.ld32.components.Tower tow) {
    return wallet.checkBalance(0, ((uk.org.ulcompsoc.ld32.systems.TowerSystem.GREEN_UPGRADE_COST) * ((tow.green.getStage()) + 1)), 0);
}