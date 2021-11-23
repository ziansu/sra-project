public void nextState() {
    FTSimulationGame.save.save();
    arcircle.ftsim.state.TalkState talkState = ((arcircle.ftsim.state.TalkState) (stateGame.getState(StateConst.TALK)));
    talkState.setLastBGM(bgm);
    stateGame.enterState(StateConst.TALK, new org.newdawn.slick.state.transition.FadeOutTransition(org.newdawn.slick.Color.black, 100), new org.newdawn.slick.state.transition.FadeInTransition(org.newdawn.slick.Color.black, 100));
}