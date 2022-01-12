private org.ovirt.engine.core.common.action.VdcReturnValueBase executeCommand(final org.ovirt.engine.core.bll.CommandBase<?> command, final org.ovirt.engine.core.bll.context.CommandContext cmdContext) {
    org.ovirt.engine.core.bll.tasks.interfaces.CommandCallback callback = command.getCallback();
    org.ovirt.engine.core.common.action.VdcReturnValueBase result = org.ovirt.engine.core.bll.utils.BackendUtils.getBackendCommandObjectsHandler(org.ovirt.engine.core.bll.tasks.CommandExecutor.log).runAction(command, (cmdContext != null ? cmdContext.getExecutionContext() : null));
    updateCommand(command, result);
    return result;
}