@java.lang.Override
public org.spongepowered.api.command.args.CommandElement[] getArguments() {
    return new org.spongepowered.api.command.args.CommandElement[]{ org.spongepowered.api.command.args.GenericArguments.onlyOne(new io.github.nucleuspowered.nucleus.argumentparsers.KitArgument(org.spongepowered.api.text.Text.of(kit), false)) , org.spongepowered.api.command.args.GenericArguments.onlyOne(org.spongepowered.api.command.args.GenericArguments.bool(org.spongepowered.api.text.Text.of(toggle))) };
}