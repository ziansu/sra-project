public boolean getLed() {
    return stateMap.get("CurrentLEDState").equals("On") ? true : false;
}