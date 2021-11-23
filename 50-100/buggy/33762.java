@java.lang.Override
public com.sk89q.intake.argument.CommandArgs transform(com.sk89q.intake.argument.CommandArgs arguments) {
    java.lang.String v = (arguments.getFlags().containsKey(flag)) ? "true" : "false";
    return com.sk89q.intake.argument.Arguments.copyOf(com.google.common.collect.ImmutableList.of(v), arguments.getFlags(), arguments.getNamespace());
}