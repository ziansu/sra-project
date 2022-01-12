@java.lang.Override
public void startAction(cn.academy.ability.api.ctrl.SyncAction action) {
    java.lang.System.out.println("AMS#INT_START");
    action.uuid = java.util.UUID.randomUUID();
    action.player = null;
    action.state = cn.academy.ability.api.ctrl.SyncAction.State.VALIDATED;
    net.minecraft.nbt.NBTTagCompound tag = action.getNBTStart();
    cn.academy.ability.api.ctrl.ActionManager.startAtClient(null, action.getClass().getName(), tag);
    map.get(cn.academy.ability.api.ctrl.AMServer.dummy).put(action.uuid, action);
}