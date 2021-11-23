@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onBucketFill(net.minecraftforge.event.entity.player.FillBucketEvent event) {
    net.minecraft.util.math.RayTraceResult pos = event.getTarget();
    if (pos == null) {
        return ;
    }
    net.minecraft.item.ItemStack ret = fillCustomBucket(event.getWorld(), pos);
    if (ret == null) {
        return ;
    }
    event.setFilledBucket(ret);
    event.setResult(Result.ALLOW);
}