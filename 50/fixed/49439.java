public void startNavigation() {
    if ((route) != null) {
        com.spoiledmilk.ibikecph.map.states.NavigatingState state = activity.changeState(com.spoiledmilk.ibikecph.map.states.NavigatingState.class);
        state.setRoute(route);
    }
}