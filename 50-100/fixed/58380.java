@java.lang.Override
public void onFailed(org.ovirt.engine.core.compat.Guid cmdId, java.util.List<org.ovirt.engine.core.compat.Guid> childCmdIds) {
    super.onFailed(cmdId, childCmdIds);
    log.error("Failed adding a Cinder snapshot. snapshot ID: {}", getDiskId());
    getCommand().getParameters().setTaskGroupSuccess(false);
    onFinish(cmdId);
}