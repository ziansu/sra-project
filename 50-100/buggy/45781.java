@java.lang.Override
public void input(final de.hauschild.ff7rl.input.Input input, final de.hauschild.ff7rl.state.StateHandler stateHandler) {
    switch (input) {
        case DOWN :
            mainMenuEntry = fromOrdinal(((mainMenuEntry.ordinal()) + 1));
            break;
        case UP :
            mainMenuEntry = fromOrdinal(((mainMenuEntry.ordinal()) - 1));
            break;
        case ACCEPT :
            de.hauschild.ff7rl.state.intro.IntroState.LOGGER.info("[{}] selected.", mainMenuEntry);
            stateHandler.nextState(StateType.BATTLE);
    }
}