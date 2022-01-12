@java.lang.Override
public org.cloudml.facade.commands.CloudMlCommand visitDebugMode(org.cloudml.ui.shell.commands.builder.ShellCommandsParser.DebugModeContext ctx) {
    return new org.cloudml.ui.shell.commands.DebugMode(ctx.state.getText().equals("true"));
}