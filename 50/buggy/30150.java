public boolean canAffordBlue(uk.org.ulcompsoc.ld32.components.Tower tow) {
    return wallet.checkBalance(0, 0, ((uk.org.ulcompsoc.ld32.systems.TowerSystem.BLUE_UPGRADE_COST) * ((tow.blue.getStage()) + 1)));
}