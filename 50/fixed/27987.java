public void remove(com.haku.lecs.system.BaseSystem... systems) {
    for (com.haku.lecs.system.BaseSystem system : systems) {
        if (this.systems.remove(system)) {
            system.onStop();
            system.setContext(null);
        }
    }
}