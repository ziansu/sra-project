public void commit() {
    if ((com.kaibla.hamster.base.Context.getTransaction()) != null) {
        commit(com.kaibla.hamster.base.Context.getTransaction());
    }
}