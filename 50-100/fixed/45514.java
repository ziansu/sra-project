@java.lang.Override
@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void setSkyRenderer(net.minecraftforge.client.IRenderHandler skyRenderer) {
    if (skyRenderer == null)
        return ;
    
    for (java.lang.reflect.Field field : skyRenderer.getClass().getDeclaredFields())
        if (net.minecraftforge.client.IRenderHandler.class.isAssignableFrom(field.getDeclaringClass()))
            super.setSkyRenderer(skyRenderer);
        
    
    if (skyRenderer instanceof stellarium.render.NewSkyRenderer)
        super.setSkyRenderer(skyRenderer);
    
}