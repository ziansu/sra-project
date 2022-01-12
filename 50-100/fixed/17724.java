public Projectors.ComponentModels.ProjectorMode getMode(java.lang.String modeId) {
    if (!(this.Modes.containsKey(modeId))) {
        Projectors.ComponentModels.ProjectorMode mode = null;
        switch (modeId) {
            case "CustomText" :
                mode = new Projectors.ProjectorModes.CustomText();
                break;
            case "GradeLiveFeed" :
                mode = new Projectors.ProjectorModes.GradeLiveFeed();
                break;
            case "RGResultaterPromotion" :
                mode = new Projectors.ProjectorModes.RGResultaterPromotion();
                break;
        }
        this.setMode(modeId, mode);
    }
    return this.Modes.get(modeId);
}