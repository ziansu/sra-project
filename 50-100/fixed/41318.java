public void channelMixerModeCmb_changed() {
    if (!(owner.refreshing)) {
        org.jwildfire.create.tina.base.Flame flame = owner.getCurrFlame();
        if (useUndoManager) {
            owner.undoManager.saveUndoPoint(flame);
        }
        flame.setChannelMixerMode(((org.jwildfire.create.tina.render.ChannelMixerMode) (data.channelMixerModeCmb.getSelectedItem())));
        refreshValues(true);
        owner.refreshFlameImage(true, false, 1, true, false);
    }
}