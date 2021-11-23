@java.lang.Override
public void postInit() {
    java.util.Map<java.lang.String, net.minecraft.client.renderer.entity.RenderPlayer> skinMap = com.feed_the_beast.ftbl.api.client.FTBLibClient.mc().getRenderManager().getSkinMap();
    net.minecraft.client.renderer.entity.RenderPlayer render = skinMap.get("default");
    render.addLayer(BadgeRenderer.instance);
    render = skinMap.get("slim");
    render.addLayer(BadgeRenderer.instance);
}