@java.lang.Override
public org.spongepowered.api.command.spec.CommandSpec createSpec() {
    return org.spongepowered.api.command.spec.CommandSpec.builder().executor(this).arguments(org.spongepowered.api.command.args.GenericArguments.onlyOne(new uk.co.drnaylor.minecraft.quickstart.argumentparsers.WarpParser(org.spongepowered.api.text.Text.of(Util.messageBundle.getString(WarpsCommand.warpNameArg)), plugin, false))).description(org.spongepowered.api.text.Text.of("Deletes a warp.")).build();
}