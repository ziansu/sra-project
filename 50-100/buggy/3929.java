private org.smartdata.server.command.Command getCommandFromCmdInfo(org.smartdata.common.command.CommandInfo cmdinfo) throws java.io.IOException {
    org.smartdata.server.command.Command cmd = new org.smartdata.server.command.Command(createActionsFromParameters(cmdinfo.getParameters()), new org.smartdata.server.command.CommandExecutor.Callback());
    cmd.setParameters(cmdinfo.getParameters());
    cmd.setId(cmdinfo.getCid());
    cmd.setRuleId(cmdinfo.getRid());
    cmd.setState(cmdinfo.getState());
    return cmd;
}