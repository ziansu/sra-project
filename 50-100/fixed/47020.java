private void executeFenceVdsManuallyAction(final org.ovirt.engine.core.compat.Guid vdsId, java.lang.String sessionId) {
    org.ovirt.engine.core.common.action.FenceVdsManualyParameters fenceVdsManuallyParams = new org.ovirt.engine.core.common.action.FenceVdsManualyParameters(true);
    fenceVdsManuallyParams.setStoragePoolId(org.ovirt.engine.core.bll.pm.RestartVdsCommand.getVds().getStoragePoolId());
    fenceVdsManuallyParams.setVdsId(vdsId);
    fenceVdsManuallyParams.setSessionId(sessionId);
    fenceVdsManuallyParams.setParentCommand(VdcActionType.RestartVds);
    runInternalAction(VdcActionType.FenceVdsManualy, fenceVdsManuallyParams, org.ovirt.engine.core.bll.pm.RestartVdsCommand.getContext());
}