public void notifyDeletion(zildo.monde.sprites.persos.Perso removedPerso) {
    java.lang.System.out.println(("Collision: remove " + removedPerso));
    int id = removedPerso.getId();
    if (removedPerso.isForeground()) {
        buffers[0].remove(id);
    }else {
        buffers[1].remove(id);
    }
}