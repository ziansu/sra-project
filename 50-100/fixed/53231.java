public void onRaceStartMessage(com.zuehlke.carrera.javapilot.akka.rapidtweak.state.RaceStartMessage message) {
    setupWatchdog();
    LOGGER.info("RaceStart received");
    if ((currentState) instanceof com.zuehlke.carrera.javapilot.akka.rapidtweak.state.LuckyPunch) {
        ((com.zuehlke.carrera.javapilot.akka.rapidtweak.state.LuckyPunch) (currentState)).stop();
    }
    setupLuckyPunch();
    if (!((currentState) instanceof com.zuehlke.carrera.javapilot.akka.rapidtweak.state.SpeedUp)) {
        setState(StateType.SPEEDUP);
    }
    ((com.zuehlke.carrera.javapilot.akka.rapidtweak.state.SpeedUp) (currentState)).onRaceStartMessage(message);
}