private void setupWidgets() {
    com.brokenshotgun.lifeinspace.StationComponent[] components = new com.brokenshotgun.lifeinspace.StationComponent[componentArray.size];
    for (int i = 0; i < (componentArray.size); ++i) {
        components[i] = componentArray.get(i);
    }
    for (int i = 0; i < (components.length); ++i) {
        if (game.getStateManager().has(components[i])) {
            restore(components[i]);
        }
    }
}