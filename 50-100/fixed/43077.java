public void pauseLogic() {
    if (logicPaused)
        return ;
    
    engine.getSystem(net.net63.codearcade.LSD.world.WorldSystem.class).setProcessing(false);
    engine.getSystem(net.net63.codearcade.LSD.world.PlayerAimSystem.class).setProcessing(false);
    engine.getSystem(net.net63.codearcade.LSD.world.PlayerSystem.class).setProcessing(false);
    engine.getSystem(net.net63.codearcade.LSD.world.AnimationSystem.class).setProcessing(false);
    logicPaused = true;
}