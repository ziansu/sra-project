public static net.minecraft.block.Block getDroppedBlock(int aDropState) {
    switch (aDropState) {
        case 0 :
            return null;
        case -1 :
            return gregtech.api.GregTech_API.sBlockOres1;
        case -2 :
            return gregtech.api.GregTech_API.sBlockOresGC;
        case -3 :
            return gregtech.api.GregTech_API.sBlockOresUb1;
        case -4 :
            return gregtech.api.GregTech_API.sBlockOresUb2;
        case -5 :
            return gregtech.api.GregTech_API.sBlockOresUb3;
        default :
            if ((aDropState >= 0) && (aDropState < (GregTech_API.sBlockOresCustom.length)))
                return gregtech.api.GregTech_API.sBlockOresCustom[(aDropState - 1)];
            
            return gregtech.api.GregTech_API.sBlockOres1;
    }
}