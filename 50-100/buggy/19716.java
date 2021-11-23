private void setupWidgets() {
    com.brokenshotgun.lifeinspace.StationComponent[] components = componentArray.toArray(com.brokenshotgun.lifeinspace.StationComponent.class);
    for (int i = 0; i < (components.length); ++i) {
        if (game.getStateManager().has(components[i])) {
            restore(components[i]);
        }
    }
}