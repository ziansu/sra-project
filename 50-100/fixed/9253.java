@java.lang.Override
public void execute(models.assetOwnership.GameMap map, models.playerAsset.Assets.Player player) throws models.ctrlCommand.CommandNotConfiguredException {
    if (isConfigured) {
        player.accept(new models.visitor.ArmyCreationVisitor(map, player, RPLocation, units));
    }else {
        throw new models.ctrlCommand.CommandNotConfiguredException((("[" + (this)) + "] is not configured."));
    }
}