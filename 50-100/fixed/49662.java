@java.lang.Override
public org.spongepowered.api.command.args.CommandElement[] getArguments() {
    return new org.spongepowered.api.command.args.CommandElement[]{ org.spongepowered.api.command.args.GenericArguments.seq(org.spongepowered.api.command.args.GenericArguments.onlyOne(new io.github.nucleuspowered.nucleus.argumentparsers.KitParser(org.spongepowered.api.text.Text.of(kit), kca, kitConfig, false)), org.spongepowered.api.command.args.GenericArguments.onlyOne(new io.github.nucleuspowered.nucleus.argumentparsers.TimespanParser(org.spongepowered.api.text.Text.of(duration)))) };
}