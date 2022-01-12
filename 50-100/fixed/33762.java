@java.lang.Override
public com.sk89q.intake.argument.CommandArgs transform(com.sk89q.intake.argument.CommandArgs arguments) {
    java.lang.String v = "false";
    for (java.lang.String flag : this.flag) {
        if (arguments.getFlags().containsKey(flag)) {
            v = "true";
            break;
        }
    }
    return com.sk89q.intake.argument.Arguments.copyOf(com.google.common.collect.ImmutableList.of(v), arguments.getFlags(), arguments.getNamespace());
}