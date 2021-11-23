public void remove(com.haku.lecs.system.BaseSystem system) {
    if (this.systems.remove(system)) {
        system.onStop();
        system.setContext(null);
    }
}