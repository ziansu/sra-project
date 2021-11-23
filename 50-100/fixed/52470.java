public void notifyDeletion(zildo.monde.sprites.persos.Perso removedPerso) {
    int id = removedPerso.getId();
    if (removedPerso.isForeground()) {
        buffers[0].remove(id);
    }else {
        buffers[1].remove(id);
    }
}