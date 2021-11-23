@java.lang.Override
public void run() {
    for (org.ovirt.engine.core.compat.Guid vdsId : getRunVdssList()) {
        if (!(getCurrentVdsId().equals(vdsId))) {
            org.ovirt.engine.core.bll.Backend.getInstance().getResourceManager().RunVdsCommand(VDSCommandType.FailedToRunVm, new org.ovirt.engine.core.common.vdscommands.FailedToRunVmVDSCommandParameters(vdsId));
        }
    }
}