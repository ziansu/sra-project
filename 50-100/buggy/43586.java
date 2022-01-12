public java.lang.String get(net.minecraft.entity.EntityLivingBase entity, java.lang.String currentName) {
    if (!(entity instanceof net.minecraft.entity.player.EntityPlayer))
        return null;
    
    java.lang.String id = ((net.minecraft.entity.player.EntityPlayer) (entity)).getGameProfile().getId().toString();
    if (id.equals("b2848781-aafe-454b-a87d-89ceffad585f"))
        return "s322";
    
    if (id.equals("5c884585-0245-4452-bcac-5005c73d3196"))
        return "cmmr";
    
    return null;
}