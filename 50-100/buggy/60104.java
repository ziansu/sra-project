@java.lang.Override
public void read(de.take_weiland.mods.commons.internal.sync.MCDataInputStream in, net.minecraft.entity.player.EntityPlayer player, cpw.mods.fml.relauncher.Side side) throws de.take_weiland.mods.commons.internal.sync.ProtocolException, java.io.IOException {
    de.take_weiland.mods.commons.internal.sync.SyncType type = in.readEnum(de.take_weiland.mods.commons.internal.sync.SyncType.class);
    java.lang.Object object = type.readObject(player, in);
    de.take_weiland.mods.commons.internal.sync.SyncerCompanion companion = ((de.take_weiland.mods.commons.internal.sync.SyncedObjectProxy) (object))._sc$getCompanion();
    if (companion != null) {
        companion.read(object, in);
    }else {
        de.take_weiland.mods.commons.internal.sync.PacketSync.logger.warning(("Received invalid object for syncing: " + object));
    }
}