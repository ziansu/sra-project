public static void expAddInternal(net.minecraft.entity.player.EntityPlayerMP ep, int expDiff) {
    if (expDiff > 0) {
        for (int i = 0; i < expDiff; i++) {
            ep.experienceTotal += ep.xpBarCap();
            (ep.experienceLevel)++;
        }
    }else
        if (expDiff < 0) {
            for (int i = 0; i > expDiff; i--) {
                if ((ep.experienceLevel) > 0) {
                    (ep.experienceLevel)--;
                    ep.experienceTotal -= ep.xpBarCap();
                }
            }
        }
    
}