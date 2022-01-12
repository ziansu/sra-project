@java.lang.Override
public void initStatesList(org.newdawn.slick.GameContainer container) throws org.newdawn.slick.SlickException {
    nl.tudelft.semgroup4.resources.Resources.init();
    nl.tudelft.semgroup4.Settings.init();
    nl.tudelft.semgroup4.StartScreenState startState = new nl.tudelft.semgroup4.StartScreenState(new nl.tudelft.semgroup4.resources.ResourcesWrapper());
    startState.init(container, this);
    addState(startState);
    addState(new nl.tudelft.semgroup4.OptionsState());
    addState(new nl.tudelft.semgroup4.ShopState(new nl.tudelft.semgroup4.resources.ResourcesWrapper()));
    addState(new nl.tudelft.semgroup4.HighscoresState());
    addState(new nl.tudelft.semgroup4.GameEndedState());
    addState(new nl.tudelft.semgroup4.KeyBindState());
    enterState(States.StartScreenState);
}