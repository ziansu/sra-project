public void removeListeners(T... listeners) {
    for (T listener : listeners) {
        this.listeners.remove(listener);
    }
}