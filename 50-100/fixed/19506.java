public org.mars_sim.msp.core.structure.building.function.farming.CropType getNewCrop(boolean isStartup) {
    if (isStartup) {
        org.mars_sim.msp.core.structure.building.function.farming.CropType ct = null;
        boolean flag = true;
        while (flag) {
            ct = getRandomCropType();
            if (ct == null)
                break;
            
            flag = containCrop(ct.getName());
        } 
        return ct;
    }else
        return selectNewCrop();
    
}