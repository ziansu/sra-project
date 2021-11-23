@java.lang.Override
public void onMapUse(net.wombatrpgs.saga.screen.TargetSelectable caller) {
    MGlobal.audio.playSFX(SConstants.SFX_SAVE);
    net.wombatrpgs.mgne.graphics.FacesAnimation appearance = net.wombatrpgs.mgne.graphics.FacesAnimationFactory.create(mdo.sprite);
    MGlobal.assets.loadAsset(appearance, "transform appearance");
    net.wombatrpgs.mgne.core.MGlobal.getHero().setAppearance(appearance);
    MGlobal.memory.switches.put(mdo.switchName, true);
    MGlobal.levelManager.getTele().getPre().addListener(new net.wombatrpgs.mgne.core.interfaces.FinishListener() {
        @java.lang.Override
        public void onFinish() {
            SGlobal.heroes.setLeaderAppearance();
            MGlobal.memory.switches.put(mdo.switchName, false);
        }
    });
}