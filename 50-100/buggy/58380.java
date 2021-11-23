@java.lang.Override
public void onFailed(org.ovirt.engine.core.compat.Guid cmdId, java.util.List<org.ovirt.engine.core.compat.Guid> childCmdIds) {
    log.error("Failed adding a Cinder snapshot. snapshot ID: {}", getDiskId());
    super.onFailed(cmdId, childCmdIds);
    getCommand().getParameters().setTaskGroupSuccess(false);
    onFinish(cmdId);
}