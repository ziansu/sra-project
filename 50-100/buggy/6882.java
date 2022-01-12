public void interact(Entity ent) {
    if (ent instanceof Player) {
        if ((GameStats.getPowerupState()) == 0) {
            ent.setHeight(((ent.getHeight()) * 2));
            ent.setY(((getY()) - ((ent.getHeight()) / 2)));
            GameStats.setPowerupState(1);
        }
        GameStats.incrementScore(1000);
        remove(getGame().getControlVar());
    }
}