public void toggleStage(final int stageNumber) {
    if ((0 <= stageNumber) && (stageMap.containsKey(stageNumber))) {
        net.sf.openrocket.rocketcomponent.Configuration.StageFlags flags = stageMap.get(stageNumber);
        net.sf.openrocket.rocketcomponent.Configuration.log.error(((("debug: toggling stage " + stageNumber) + " to ") + (!(flags.active))));
        flags.active = !(flags.active);
        fireChangeEvent();
        return ;
    }
    net.sf.openrocket.rocketcomponent.Configuration.log.error(("error: attempt to retrieve via a bad stage number: " + stageNumber));
}