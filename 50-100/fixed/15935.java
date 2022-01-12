public void setMode(com.umbra.manager.modes.Modes state) {
    this.state = state;
    switch (state) {
        case BATLLE :
            mode = com.umbra.manager.modes.ModesInstantiator.battleModeInstance(characters);
            break;
        case MAZE :
            mode = com.umbra.manager.modes.ModesInstantiator.mazeModeInstance(characters);
            break;
        case PUZZLE :
            mode = com.umbra.manager.modes.ModesInstantiator.puzzleModeInstance(characters);
            break;
        case VULTO :
            mode = com.umbra.manager.modes.ModesInstantiator.vultoModeInstance(characters);
            com.umbra.manager.modes.ModesInstantiator.vultoModeReset(characters);
            break;
    }
}