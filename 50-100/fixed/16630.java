private void attack() {
    for (int i = 0; i < (TROOPER_COUNT); i++) {
        upm.cmsc.starwars.entities.StormTrooper st = troopers.get(i);
        if ((!(st.isDead())) && (((st.getX()) - (luke.getX())) <= (LUKE_TROOPER_DISTANCE))) {
            st.setDead(true);
            trooperAnimation.set(i, upm.cmsc.starwars.entities.StormTrooper.getDeadAnimation());
            return ;
        }
    }
}